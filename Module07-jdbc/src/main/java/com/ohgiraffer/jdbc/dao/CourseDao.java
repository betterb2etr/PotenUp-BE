package com.ohgiraffer.jdbc.dao;

import com.ohgiraffer.jdbc.util.QueryUtil;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO(Data Access Object)
 * 데이텁ㅇ
 */
public class CourseDAO {
    private final Connection connection;
    public CourseDAO(Connection connection, Connection connection1) {
        this.connecton = connection;
    }
    public List<Course> findall() throws SQLException{
        List<Course> courses = new ArrayList<>();
        String sql = "select course_id, author_id, title, description, status FROM courses";
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            ResultSet re = pstmt.executeQuery();
            while(re.next()){
                Course course = new Course(
                        re.getLong("course_id"),
                        re.getLong("author_id"),
                        re.getString("title"),
                        re.getString("description"),
                        re.getString("status")
                );
                courses.add(course);

            }
        }
        return courses;
    }
    public long save(Course course) throws SQLException{
        String sql = QueryUtil.getQuery("course.save");

        try(PreparedStatement pstmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            pstmt.setLong(1, course.getAuthorId());
            pstmt.setString(2,course.getTitle());
            pstmt.setString(3,course.getDescription());
            pstmt.setString(4,course.getStatus());

            long result = pstmt.executeUpdate();
            if(result>0){
                try(ResultSet rs = pstmt.getGeneratedKeys()){
                    if(rs.next()){
                        return rs.getLong(1);
                    } else{
                System.out.println("failed");
            }
                }
                else if(num==2) {
            System.out.print("조회할 과정 번호 : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            Course foundModule = courseService.findCourse(id);
        }
        }
        throw new SQLException("강좌 생성에 실패하였습니다.");
    }
    public Course findById(long id) throws SQLExcepton {
    String query = QueryUtil.getQuery("course.findById");
    try(PrepareStatement pstmt = connection.prepareStatement(query)){
        pstmt.setLong(1,id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return new Course(
                    rs.getLong(1),
                    rs.getLong(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );
        }else{return null;
        }
    }catch (RuntimeException e){
        throw new RuntimeException(e.getMessage());
    }
    }
    public int update(Course course) throws SQLException {
    String query = QueryUtil.getQuery("course.update");
    int rowsAffected =0;
    try(PreparedStatement pstmt = connection.prepareStatement(query)){
        pstmt.setString(1,course.getTItle());
        pstmt.setString(2,course.getDescription());
        pstmt.setLong(3,course.getCourseID());
        rowsAffected = pstmt.executeUpdate();
    }
    return rowsAffected;
    }
/**
 * course id를 전달받고 삭제함
 * @param id 삭제할 값
 * @return 0: fail, 1 - success
 */
public int delete(long id) throws SQLException{
    //1. 삭제하라고 질의함
    String query = QueryUtil.getQuery("course.delete");
    //2. 결과를 저장
    int rowsAffected =0;
    //3.DB 요청
        try (PreparedStatement pstmt = connection.prepareStatement(query)){
        pstmt.setLong(1, id);
        rowsAffected = pstmt.executeUpdate();
        }
        return rowsAffected;
}
}
