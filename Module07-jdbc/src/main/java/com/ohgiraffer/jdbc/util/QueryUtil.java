package com.ohgiraffer.jdbc.util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class QueryUtil {
    private static final Map<String, String> queries = new HashMap();
    static{
        loadQueries();
    }

    private static void loadQueries() {
        try{
            InputStream inputStream = QueryUtil.class.getClassLoader().getResourceAsStream("queries.xml");
            //쿼리클래스에서 로드한다음에 바이트 단위로 가져오겠다
            if(inputStream == null){
                throw new RuntimeException("queries.xml not found");
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            //문서의 구조를 이해할 수 있는 객체, xml을 가져오기 위한 장치
            Document document = (Document)builder.parse(inputStream);
            //w3c
            //문서에 있는 요소들을 정규화 해서 가져옴
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("query");
            for(int i = 0; i < nodeList.getLength(); i++){
                //w3c
                Element queryElement = (Element)nodeList.item(i);
                String key = queryElement.getAttribute("key");
                String sql = queryElement.getTextContent().trim();
                queries.put(key, sql);
            }

        }catch(Exception e){
            throw new RuntimeException("쿼리 로딩중 오류 발생", e);
        }
    }

    public static String getQuery(String key) {
        return queries.get(key);
    }
}
