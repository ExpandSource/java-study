# Java 기초 프로그래밍

## Index
1. 자바 설치 및 IDE 설치와 사용
   - 프로그래밍이란?
   - 주석, 실행문
   - JDK, JRE ,JVM
2. 변수
   - 변수 선언, 변수 초기화(Initialize)
   - 변수 사용, 변수 사용범위(Scope)
3. 타입
   - 정수 타입 : int, long
   - 실수 타입 : double
   - 논리 타입 : boolean
4. 타입 변환
   - 자동 타입 변환 (Promotion) : 작은범위 -> 큰 범위
   - 강제 타입 변환 (Casting) : 큰 범위 -> 작은 범위 (캐스팅연산자)
5. 연산자
   - 단항 연산자, 이항 연산자, 삼항 연산자 
   - 산술 연산자, 대입 연산자, 증감 연산자 등
   - 연산자 우선순위가 존재 : (), ......  =
6. 조건문
   - if
   - if-else, if-else-if
   - switch - case
7. 반복문
   - while
   - for
   - do-while
   - break, continue
8. 배열
   - 배열 선언, 배열 초기화, 배열 길이
   - 다차원 배열
   - 향상된 for문
9. 메서드
   - 메서드 선언, 메서드 호출,
   - 리턴값, 리턴 타입
   - 매개변수(parameter), 인자(argument)
   - 메서드 오버로딩(overloading)
10. 클래스
   - **객체지향 프로그래밍**
   - 필드, 생성자, 메서드
   - 패키지, 접근 제어자
   - static, 인스턴스 멤버와 정적 멤버
   - final, 싱글톤
   - 캡슐화, 상속, 다형성, 추상화
11. 상속
12. 인터페이스
13. 중첩 클래스

## 메서드 정의
- 제어자(Modifier) : public, static
- 리턴타입(Return Type) : 메서드가 실행된 뒤 반환되는 타입
- 메서드이름(Method Name) : 메서드를 호출하는데 사용됨. 기능이 드러나도록 이름을 짓는 것이 좋다.
- 매개변수(Parameter) : 입력 값. 메서드 내부에서 사용 가능한 변수, 매개변수가 없을 수도 있음.
- 메서드 본문(Method Body) : 실행되는 코드 블록. {} 사이 위치

## 메서드의 종류
 - 매개변수가 없고 리턴타입도 없는 메서드 정의
 - 리턴 타입이 없는 경우 void[를]() 사용

## 메서드의 장점
 1. 반복되는 코드의 중복을 줄일 수 있다.
 2. 작업이 분리되어 코드의 가독성이 향상된다.
 3. 코드를 다른 프로그램에서 재사용할 수 있다.
 4. 기존의 기능을 확장해서 사용하는데 유용하다. 
 5. 메서드를 사용할 때는 내부 작업, 구현부에 대해 알 필요가 없이 사용할 수 있다.
 6. 모듈화된 메서드는 개별적으로 테스트하고 디버깅할 수 있다.
 7. 유지보수가 용이해진다. 

## 메서드 명명 규칙
 - 기본적으로 변수의 이름을 붙이는 방식과 같다. (CamelCase 등)
 - 메서드의 이름에는 동사를 사용해서 시작하는 것이 좋다.
   - addNumbers : 두 숫자를 더하는 메서드 <- 명시적으로 추측 가능
   - getStudentInfo : 학생의 정보를 가져오는 메서드
   - setEmployeeName : 직원의 이름을 설정하는 메서드
- 일반적으로 널리 사용되지 않는 약어는 사용하지 않는 것이 좋다.
  - addN, getSi, setEn <- 무슨 동작을 하는 메서드인지 추측하기 어렵다.

## 객체지향 프로그래밍
- 절차적 프로그래밍 (Procedural Programming)
  - 프로그램을 일련의 순서, 절차나, 함수의 집합으로 보는 방식 
  - 상단에서부터 하단으로 프로그램 코드를 순서대로 실행
  - 함수(Function)/절차(Procedure)를 정의하고 호출
- 객체지향 프로그래밍(OOP : Object-Oriented Programming)
  - 프로그램을 객체(Object)의 집합으로 보는 방식
  - 객체는 데이터(속성, 필드)과 데이터를 조작하는 기능(함수, 메서드)으로 캡슐화됨.
  - 주요 4대 특징
    - 캡슐화 : 데이터와 기능을 캡슐처럼 함께 포장
    - 상속 : 한 클래스가 다른 클래스의 특성을 상속받음
    - 다형성 : 객체 타입에 따라 다른 방식으로 작동
    - 추상화 : 복잡한 실제 세계를 단순한 모델로 표현
- 모든 사물과 개념을 속성과 기능을 가지고 있는 객체로 단순화, 추상화 시키는 것.
- 추상화 -> 모델링 : 데이터 + 행동
- 객체 지향 프로그래밍 방법이 가장 널리 사용되고 있다.

## 클래스
   - 객체를 생성하기 위한 설계도 혹은 틀, 템플릿
   - 클래스의 구조
     1. Field : 객체의 데이터
     2. Constructor : 객체를 생성할 때 초기화를 담당
     3. Method : 객체가 수행하는 행동

## 객체(Object)
   - 클래스(설계도)에서 정의된대로 메모리에 할당되는 인스턴스(instance : 실례, 사례)
   - new 키워드를 통해서 객체를 생성

- 객체(Object)와 인스턴스(instance)의 차이
    - 클래스에서 나온 실체. 인스턴스는 클래스의 관계에 맞춰져있음.
      - Student는 클래스다. `Student student1 = new Student()`
      - student1은 Student의 인스턴스다.
      - student1은 객체다.

## 생성자
  - 특징 
    1. 클래스 이름과 동일
    2. 리턴 타입이 없음 (void도 사용하지 않음)
    3. 오버로딩이 가능 (매개변수의 타입이나 개수에 따라 여러개 정의 가능)
  - 종류
    1. 기본 생성자 : 사용자가 정의하지 않으면 컴파일러에서 자동 생성 (매개변수 없음)
    2. 사용자 정의 생성자 : 매개변수를 가지고, 객체 생성시 초기값을 전달
  - this 키워드
    - 객체가 자기 자신을 가리키는데 사용되는 키워드
    - 생성자에서 매개변수와 클래스의 필드 이름이 중복되는 경우가 있을 때
    - this 키워드를 통해 둘을 구분
      - `this.name = name`
    - this() : 다른 생성자를 호출할 때
      - 생성자 오버로딩이 있을때 코드의 중복을 줄일 수 있음.

## 패키지
- 패키지 생성 규칙 및 관례
  1. 패키지는 전세계에서 유일하게 만드는 것이 좋다.
    - 일반적으로 인터넷 도메인 이름을 역순으로 사용한다.
      - `com.google.project.pack.abc`, `com.naver.cafe.member`
  2. 패키지 이름에는 모두 소문자만 사용한다.
  3. `.`을 사용해서 계층 구조를 만든다.
  4. 예약어를 사용할 수가 없다. `class`, `enum` `package` 사용불가
  5. 숫자로 시작할수 없다.
  
  - `package0` 상위패키지
    - `package0.first` 하위패키지
    - `package0.second`
  - 세 패키지는 계층 구조를 이루지만, 각각의 패키지는 서로 다른 패키지이다.

## 접근제한자 Access Modifier
1. public
   - 어떤 클래스에서도 접근 가능
   - 사용자에게 접근을 열어두고 싶은 경우
2. protected
   - 상속 관계에서 부모 클래스가 자식 클래스에세 접근 가능할 때 사용
   - 다른 패키지에 있을 경우에도.
3. default (package-private)
   - 접근 제한자를 명시하지 않는 경우
   - 같은 패키지 내부에서만 접근, 사용이 가능하다
4. private
   - 해당 멤버를 선언한 클래스에서만 접근 가능
   - 사용자에게 접근을 차단하고 싶은 경우, 내부 구현을 숨기고 싶은 경우

## Getter, Setter 메소드
- 객체지향 프로그래밍에서는 일반적으로 객체의 필드값에 외부 직접 접근을 막는다.(private)
- 사용자가 개발자의 의도에 맞게 변경하거나 값을 가지고 올 수 있도록 별도의 메서드를 만든다.
- 데이터의 무결성을 유지할 수 있음.
- 캡슐화 원칙을 실현하고, 데이터를 보호할 수 있음
1. Getter : 필드의 안전한(제약조건, 무결성 유지하며) 읽기  `getSpeed`
2. Setter : 필드의 값을 안전하게(제약조건, 무결성 유지하며) 설정  `setSpeed`

## 자바의 메모리 영역 구조
1. 스택(Stack) 영역
   - 자바를 실행하면, 각 스레드에 의해 실행 스택이 생성되고, 
   - 메서드가 호출될 때마다 메서드를 위한 스택 프레임이 생성된다.
   - 스택 프레임에서는 변수 등이 선언되고 메서드 종료시 제거된다.
2. 힙(Heap) 영역
   - 모든 객체와, 배열이 생성되고 동적으로 할당되는 영역
   - 모든 스레드에서 공유가 된다.
   - 더 이상 참조가 되지 않는 객체는 GC(Garbage Collector)에 의해 제거된다.
3. 메서드(Method) 영역
   - 프로그램을 실행하는데 필요한 공통 데이터를 공유하는 영역
   - 모든 스레드에 공유되고, 한번 불러온 클래스 정보는 이 영역에 저장됨.
   - 클래스의 정보, 메서드의 실행 코드, static 영역, 상수 등을 보관

### Stack 자료구조와 Queue 자료구조
  1. Stack 자료구조
    - 후입선출(LIFO : Last In First Out) 방식으로 작동
    - 마지막에 들어간 데이터가 먼저 나온다.
    - 프링글스 통, 입구가 좁은 냉장고 칸
    - 활용 
      - 웹브라우저의 뒤로가기 / 앞으로 가기
      - 실행 취소(Ctrl + Z) / 재실행
      - 자바의 스택 영역
    - 일반적으로 데이터 입력을 push, 출력을 pop이라고 한다.
    - 데이터 삽입 예시
      - 1 (push) -> 2 (push) -> 3 (push) -> 3(pop) -> 2(pop) -> 1(pop)
  2. Queue 자료구조
    - 선입선출(FIFO : Fist In First Out) 방식으로 작동
    - 먼저 들어온 데이터가 먼저 나온다.
    - 식당에서 대기줄을 설때
    - 활용
      - 프린터 출력 대기 큐
    - 데이터 삽입 예시
      - 1 (입력) -> 2(입력) -> 3(입력) -> 1(출력) -> 2(출력) -> 3(출력)

## 변수의 종류 
1. 인스턴스 변수
    - 클래스 내부에서 선언
    - 객체마다 독립적으로 존재하는 변수 (힙 영역에 매번 새로 만들어짐)
    - `static`이 붙지 않은 변수
    - 더 이상 참조하는 변수가 없을 경우 GC이 제거 (객체 소멸 시 함께 제거됨)
    - 객체의 상태를 저장하는데 사용
2. 클래스 변수 
    - 클래스 내부에서 선언
    - 모든 객체에서 공유되는 변수 (메서드 영역에 저장)
    - `static`이 붙는 변수
    - 프로그램이 종료될 시 제거
    - 클래스의 공통적인 정보를 저장하는데 사용
3. 지역 변수
   - 메서드 내에서 지역적으로 사용되는 변수
   - 메서드가 종료(스택 프레임이 제거)되면서 제거 
   - 매개변수(Parameter)도 동일한 생명주기를 갖는다.
   - 메서드와 관련된 임시적인 값을 저장할 때 사용
- 생명주기 길이 순서
  - 클래스 변수 > 인스턴스 변수 > 지역 변수

## static 키워드
- static 변수
  - 해당 클래스의 모든 인스턴스에서 공유되는 변수
  - 같은 클래스의 모든 객체는 같은 값을 갖게 됨.
  - 메소드 영역에 할당
  - 메모리 사용량을 줄여서 효율성을 높일 수 있음
  - 객체 생성 없이 사용할 수 있음.
- static 메소드
  - 객체 생성 없이 호출할 수 있음.
  - static 메소드에서는 static 변수와, static 메소드만 접근 가능.
  - 주로 유틸리티성 함수를 작성하는데 사용된다.
- static 키워드의 장점과 주의점
  - 장점 : 메모리 사용 효율화, 코드 간결성
  - 주의점 : 캡슐화를 약화시킬 수 있음. 코드 이해가 어려울 수 있음.

## 상속 Inheritance
    - 객체지향의 핵심 개념 중 하나
    - 한 클래스가 다른 클래스의 필드와 메서드를 이어받아 사용할 수 있음 
    - 코드의 재사용성을 높이고, 중복을 줄이고, 구조를 체계적으로 관리할 수 있음.

    - 부모 클래스(Super Class) : 상속을 통해 다른 클래스에 필드와 메서드를 제공
    - 자식 클래스(Sub Class) : 부모 클래스로부터 필드와 메서드를 상속받는 클래스

    - "is-a" 관계를 모델링한다.
        - Dog is a Animal.  : Dog 클래스는 Animal 클래스에게 상속 받음.
        - HydroCar is a Car. : HydroCar 클래스는 Car 클래스에게 상속받음.

    - 자바에서는 상속 대상은 하나만 선택할 수 있다.
    - 다중 상속은 다이아몬드 문제가 발생할 수 있어 다중상속을 허용하지 않음.
    - 자식 클래스는 부모 클래스를 알지만, 부모 클래스는 자식 클래스를 모른다.

    - 상속 관계의 메모리 구조
        - 상속 관계의 객체를 생성하면 부모와 자식이 모두 생성된다.
        - 상속 관계 객체를 호출할 때, 호출자의 타입을 통해 대상 타입을 찾는다.
        - 대상 타입에서 메서드를 찾지 못할 때, 부모 타입의 메서드를 찾아 실행한다.

    - 메서드 오버라이딩
        - 상속을 통해 얻은 메서드를 자식 클래스에서 재정의 하는 것.
        - 상속받은 메서드의 구현부를 변경할 수 있다.
        - 오버라이딩 조건
            - 메서드 이름이 같아야 한다.
            - 매개변수가 같아야 한다.
            - 접근제어자가 부모보다 같거나 넓어야 한다.
        - @override 애노테이션을 사용한다.
    
    - 메서드 오버로딩(Overloading)과 오버라이딩(Overriding)의 차이
        - 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것.
        - 오버라이딩 : 하위 클래스에서 상위 클래스 메서드를 재정의 하는 것.

    - 상속을 사용할 때 주의할 점
        1. "is-a" 관계가 성립할 때만 사용. 기타 다른 경우 예를 들어 "has-a" 관계일 때는 상속보다 포함(Composition)을 사용하는 것이 더 권장된다.
            - Car is a Tire. (X 상속X) Car has a Tire. (O 포함)
        2. 너무 깊은 상속 트리는 피한다.
            - 코드를 이해하기 어렵고, 유지보수가 복잡해질 수 있습니다.
            - 코드 복잡성이 증가한다.
        3. 부모 클래스의 변경에 주의한다.
            - Super Class 변경시 모든 자식 클래스의 영향을 미친다.
            - 코드 의존성이 증가한다.

## 다형성 (Polymorphism)
    - 객체가 여러 형태를 가질 수 있는 성질
    - 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조 가능


## 인터페이스 
    - 메모리 구조상 클래스, 추상 클래스, 인터페이스는 동일하다.
    - 컴파일 될 때 `.class`파일로 컴파일 되고, 소스 코드도 `.java`로 작성된다.

    - 상속과 구현
        - 부모 클래스 기능을 자식 클래스가 상속 받을 때 'extends(확장, 상속)'으로 표현하지만,
            - 부모의 기능을 물려받는 것이 목적
        - 부모 인터페이스의 기능을 자식 클래스가 상속받을 때는 'implements(구현)'으로 표현한다.
            - 물려받는 기능은 없고, 자식이 모든 메서드를 구현해야할 의무가 있음.

    - 인터페이스를 사용하는 이유
        1. 제약 : 추상 클래스는 본문을 가진 실행 가능한 일반 메서드가 끼어들 수 있다. 상속받은 자식 클래스에서 기능을 구현하지 않을 수 있는 가능성이 있다. 해당 문제 원천 차단 가능
        2. 다중 구현 가능 : 자바 클래스는 다중 상속이 불가능, 부모 클래스로 하나만 지정 가능한데, 인터페이스는 다중 구현(다중 상속)이 가능

# 객체지향 프로그래밍
    - OOP 4대 특성
        - 캡슐화, 추상화, 상속, 다형성
    - OOP 5대 원칙 (SOLID)
        1. SRP : Single Responsibility Principle - 단일책임원칙
            - 하나의 클래스는 하나의 책임만 가져야 한다
        2. OCP : Open Closed Principle - 개방폐쇄원칙
            - 확장에는 열려 있어야 하지만, 수정에는 닫혀 있어야 한다.
        3. LSP : Liskov Substitution Principle - 리스코프 치환 원칙
            - 객체는 해당 객체의 하위타입으로 치환할 수 있어야 한다.
        4. ISP : Interface Segregation Principle - 인터페이스 분리 원칙
            - 필요하지 않은 인터페이스는 분리시켜야 한다.
        5. DIP : Dependancy Inversion Principle - 의존성 역전 원칙
            - 세부사항은 추상화에 의존해야 하고, 추상화는 세부사항에 의존해서는 안된다. 
    - 실세계의 사물과 개념을 추상화하여 표현한 객체(Object)들의 모임, 각 객체(데이터와 행위)는 메시지를 주고받으며, 상호작용한다. => 객체의 협력
    - 유연하고 변경이 쉬운 소프트웨어 개발
        - 컴포넌트를 쉽고 유연하게 변경하고, 블럭을 조립하듯이 개발 
    - 역할(Role)과 구현(Implementation)으로 구분 => 분리
        - 역할 : 객체가 시스템에서 수행하는 책임과 기능, 하나 이상의 역할 가질 수 있음 => 인터페이스
        - 구현 : 객체의 역할을 실제 코드로 구현 => 구현 클래스
        - 역할과 구현을 분리하면 클라이언트에 영향을 주지 않는 변경이 가능하다.
        - 인터페이스를 설계할 때 잘 설계하는 것이 필요.
    - 객체의 협력 : 서버와 클라이언트 
        - Server : 요청을 받는 쪽 (응답 : response)
        - Client : 요청을 하는 쪽 (요청 : request)
        












