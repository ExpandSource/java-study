package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex2 {
    /*
    연습문제 : 사용자로 부터 데이터 입력받기
    요구사항
    사용자로부터 userId, userName, password, age, email을 입력받아, JDBC를 사용하여 데이터베이스의 users 테이블에 새로운 사용자 정보를 삽입하는 Java 애플리케이션을 작성하세요.

    Java 애플리케이션은 사용자로부터 다음 정보를 입력받아야 합니다:
    userId: 사용자 ID
    userName: 사용자 이름
    password: 비밀번호
    age: 나이
    email: 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 삽입합니다.
    데이터 삽입이 성공적으로 완료되면, 삽입된 행의 수를 출력합니다.
    오류 발생 시 적절한 오류 메시지를 출력하고 프로그램을 종료합니다

    === 출력예시 ===

    사용자 ID를 입력하세요: spring
    사용자 이름을 입력하세요: 봄봄
    비밀번호를 입력하세요: 23456
    나이를 입력하세요: 25
    이메일 주소를 입력하세요: spring@def.com

    데이터가 성공적으로 삽입되었습니다. 삽입된 행의 수: 1
     */
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID를 입력하세요 : ");
        String userId = scanner.nextLine();
        System.out.print("사용자 이름을 입력하세요: ");
        String userName = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String userPassword = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine();     // 버퍼 비우기 (개행문자)
        System.out.print("이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();

        String sql = """
                    INSERT INTO users (userId, userName, password, age, email)
                    VALUES (?, ?, ?, ?, ?)
                    """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ){

            pstmt.setString(1, userId);
            pstmt.setString(2, userName);
            pstmt.setString(3, userPassword);
            pstmt.setInt(4, age);
            pstmt.setString(5, email);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println("데이터가 성공적으로 삽입되었습니다. 삽입된 행의 수 " + rows);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
