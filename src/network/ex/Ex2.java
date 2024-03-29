package network.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex2 {
    /*
    연습문제 : 웹 페이지 제목 추출기

    주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요. 이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

    - 웹 페이지의 HTML 내용을 가져옵니다.
    - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
    - 추출한 텍스트를 출력합니다.

    - 입력 예시: https://www.example.com
    - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("웹페이지 URL을 입력하세요 : ");
        String urlString = scanner.nextLine();

        // String urlString = "https://www.iana.org/";

        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            // URL 연결에서 기반 InputStream 을 반환하여
            // 보조 스트림 연결
            BufferedReader reader =
                    new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {

                if (line.contains("<title>")) {

                    int startIndex = line.indexOf("<title>") + 7;
                    int endIndex = line.indexOf("</title>");

                    String title = line.substring(startIndex, endIndex);
                    System.out.println("웹페이지 제목 : " + title);
                }
            }


        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다.");
        } catch (IOException e) {
            System.out.println("입출력에 문제가 발생하였습니다.");
        }
    }
}
