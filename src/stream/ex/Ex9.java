package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex9 {
    public static void main(String[] args) {
        /*
        연습 문제 1: 도서관 책 대여 기록 분석
    도서관의 책 대여 기록이 있습니다. 각 대여 기록에는 사용자 ID와 대여한 책의 수량이 포함되어 있습니다. 여러분의 목표는 다음 정보를 계산하는 것입니다:

    - 전체 대여된 책의 수량을 계산하세요.
    - 대여 기록이 가장 많은 사용자의 ID를 찾으세요.

    record BookRental(String userId, int quantity) {}

    List<BookRental> rentals = Arrays.asList(
        new BookRental("user1", 3),
        new BookRental("user2", 5),
        new BookRental("user3", 1),
        new BookRental("user4", 2)
    );

    출력예시
    ===
    전체 대여된 책의 수량: 11
    가장 많은 책을 대여한 사용자: user2
         */
        record BookRental(String userId, int quantity) {}

        List<BookRental> rentals = Arrays.asList(
                new BookRental("user1", 3),
                new BookRental("user2", 5),
                new BookRental("user3", 1),
                new BookRental("user4", 2)
        );

        // 1.
        int sum = rentals.stream()    //  객체 스트림
                .mapToInt(BookRental::quantity) // 정수 스트림
                .sum();

        System.out.println("전체 대여된 책의 수량: " + sum);

        // 2. 가장 많은 책을 대여한 사용자: user2
        Optional<BookRental> max = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity));

        System.out.println("가장 많은 책을 대여한 사용자: " + max.get().userId);

        // Optional의 map은 변환된 Optional을 반환함.
        String topUserId = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity))
                .map(bookRental -> bookRental.userId)
                .orElse("찾지 못했습니다.");

        System.out.println("가장 많은 책을 대여한 사용자: " + topUserId);

    }
}
