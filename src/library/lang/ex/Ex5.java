package library.lang.ex;

public class Ex5 {
    /*
    연습문제 1: 경과 시간 측정

    요구사항:
    100만번의 반복문을 실행하는 데 걸리는 시간(나노초 단위)을 측정하세요.
    반복문은 간단한 연산(예: 카운터 증가)을 수행하도록 합니다.
    System.nanoTime()를 사용하여 시작 시간과 종료 시간을 측정합니다.
    경과 시간을 계산하여 출력하세요.

    실행 결과 예시:
    반복문 실행 시간: 15
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int number = 0;

        for (int i = 0; i < 1_000_000; i++) {
            number++;
        }

        long endTime = System.nanoTime();

        System.out.println("반복문 실행 시간 : " + (endTime - startTime) + " 나노초");
    }
}
