package collection.map;

import java.io.IOException;
import java.util.Properties;

public class Map6 {
    // Properties : Hashtable의 자식 클래스
    // Key, Value 를 문자열(String) 타입으로 제한한 컬렉션
    // 주로 확장자가 properties 인 파일을 읽을 때 활용
    // 설정 파일이나, 환경 변수를 접근하는데 사용된다.
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // Properties 컬렉션에 이 파일과 같은 위치에 있는 파일 로드하기
        // 설정파일을 읽기
        properties.load(Map6.class.getResourceAsStream
                ("database.properties"));

        // properties 객체에서 키로 값 가져오기
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("driver = " + driver);
    }
}
