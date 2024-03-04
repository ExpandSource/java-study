package exception.ex.ex3;

import java.util.Scanner;

public class Ex3 {
    /*
    연습문제 3: 사용자 입력 데이터 검증 및 예외 처리

요구사항:
사용자로부터 이메일 주소를 입력받아, 올바른 형식인지 검증하는 프로그램을 작성하세요.
이메일 주소가 올바른 형식이 아닐 경우, 사용자 정의 예외 InvalidEmailException을 발생시키고 적절한 메시지를 출력하세요.
이메일 형식 검증은 간단히 '@' 문자가 포함되어 있는지 여부만 확인합니다.

예상 실행 결과
===
이메일 주소를 입력하세요: user@example.com
이메일 주소가 유효합니다.

이메일 주소를 입력하세요: userexample.com
예외 발생: 유효하지 않은 이메일 주소입니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


/* 방식1.
        if (email.contains("@")) {
            System.out.println("이메일 주소가 유효합니다.");
        } else {
            try {
                throw new InvalidEmailException("유효하지 않은 이메일주소입니다.");
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }
*/
        // try with resource
        try (scanner) {
            System.out.println("이메일 주소를 입력하세요: ");
            String email = scanner.nextLine();
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println("예외가 발생했습니다. " + e.getMessage());
        }
        // 스캐너가 종료


    }

    private static void validateEmail(String email) throws InvalidEmailException {
        // 검증 코드
        if (!email.contains("@")) {
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }
        // 실행 코드
        System.out.println("이메일 주소가 유효합니다.");

    }

}
