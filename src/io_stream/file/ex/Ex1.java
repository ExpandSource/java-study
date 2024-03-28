package io_stream.file.ex;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    /*
    연습문제 1: 사용자 정보 저장 및 조회 시스템
    사용자로부터 이름, 이메일, 나이를 입력받아, 각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요. 그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

    요구사항:

    - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
    - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
    - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
    - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

    실행예시
    ===
    1: 정보 저장, 2: 정보 조회
    1
    이름: 홍길동
    이메일: abc@def.com
    나이: 30
    정보 저장 완료.


    1: 정보 저장, 2: 정보 조회
    2
    홍길동.user
     */
    public static void main(String[] args) {
        String currentPath = "src/io_stream/file/ex/";

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보 저장, 2:정보 조회");
        int choice = scanner.nextInt();

        scanner.nextLine();     // 개행문자 버퍼를 비워줌

        // 정보 저장
        if (choice == 1) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("이메일: ");
            String email = scanner.nextLine();
            System.out.print("나이: ");
            String age = scanner.nextLine();

            saveUser(currentPath, name);
        } else if (choice == 2) {

            listFileInfo(currentPath);
        } else {
            System.out.println("1또는 2를 선택하세요");
        }
    }

    private static void saveUser(String currentPath, String name) {
        File file = new File(currentPath + name + ".user");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("이름: " + name);
            bw.newLine();
            bw.write("이메일: " + name);
            bw.newLine();
            bw.write("나이: " + name);
            bw.newLine();
            System.out.println("정보 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listFileInfo(String currentPath) {
        File currentDir = new File(currentPath);
        // File file = new File("."); 현재 경로를 반환
        File[] files = currentDir.listFiles();

        for (File f : files) {
            // 파일 경로에서 파일 이름만 꺼내기
            String fileName = f.getName();
            // 문자열 끝 부분(확장자) 일치여부 확인
            if (fileName.endsWith(".user")) {
                System.out.println(fileName);
            }
        }
    }
}
