package com.ohgiraffer.jdbc.config;

import com.ohgiraffer.jdbc.service.CourseService;
import com.ohgiraffer.jdbc.util.QueryUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        try{
            Connection conn= JDBCConnection.getConnection();
            System.out.println(QueryUtil.getQuery(course.save));
            System.out.println("데이터베이스 연결 성공");
            Scanner scanner = new  Scanner(System.in);
            while(true){
                System.out.println("=====1 기초실습 ====");
                System.out.println("===2 중급 실습===");
                int num = scanner.nextInt();


                if(num==1){
                    runBeginnerExercise(conn);
                }else if(num==2){
                    runIntermediateExercise(conn);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 전체 과정을 조회하고 출력한다
     * @param conn db 커넥션 객체
     * @throws SQLException
     */

    public static void  runBeginnerExercise(Connection conn) throws SQLException{
        CourseService courseService = new CourseService(conn);
        List<Course> courses = courseService.courseFindALl();
        for(Course course: courses)System.out.println(course);
    }
    public static void  runIntermediateExercise(Connection conn)throws SQLException{
        System.out.println("");
        CourseService = new CourseService(conn);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("=====작업 선택 =======");
            System.out.println("=====1.과정등록");
            int num = scanner.nextInt();
            if(num==1){
                String title = scanner.nextLine();
                String description = scanner.nextLine();
                Course course = new Course(1L, title, description, "draft");
                System.out.println(course);
                long result = courseService.courseSave(course);

                if(result<0){
                    System.out.println("==");
                }else{
                    System.out.println("==모듈 등록 실패==");
                }
            }else if(num ==2 ){
                int id = scanner.nextInt();
                scanner.nextLine();
                Course foundModule = courseService.findCOurse(id);
            }
            else if(num==3){
                long id = scanner.nextInt();
                scanner.nextLine();
                String newTitle = scanner.nextLine();
                String newDescritiption = scanner.nextLine();
                int result = courseService.updateCourse(id, newTitle, newDescritiption);

                if(result>0){
                    System.out.println("과정 수정 성공!");
                    Course updatedCourse = courseService.findCOurse(id);
                    System.out.println("수정 후 과정: " + updatedCourse);

                }
            }
            else if(num==4){
                //1.삭제할 번호를 입력해주세요 -> 번호
                System.out.println("삭제할 과정 번호를 입력해주세요");
                long id = scanner.nextLong();
                scanner.nextLine();

                //2. 서비스에 넘겨준다
                /**
                 * 전에 입력받고, 후: 반환값(int)
                 *
                 */
                if(id>0){
                    int result = courseService.deletedCourse(id);
                    if(result>0){
                        System.out.println("삭제 성공 삭제 id: " + id);
                    }else{
                        System.out.println("삭제 실패 id: " + id);
                    }
                }else{
                    //값이 없을 경우
                    System.out.println("error : 값을 다시 입력해주세요.");
                }
            }


        }
    }
}
