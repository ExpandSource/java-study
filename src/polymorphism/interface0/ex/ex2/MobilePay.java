package polymorphism.interface0.ex.ex2;

public class MobilePay implements Payment {

    @Override
    public void pay(long amount) {
        System.out.println("모바일 결제로 " + amount + "원 결제하였습니다.");
    }
}
