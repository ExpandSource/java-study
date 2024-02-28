package polymorphism.interface0.ex.ex2;

public class BankTransfer implements Payment {
    @Override
    public void pay(long amount) {
        System.out.println("계좌이체로 " + amount + "원 결제하였습니다.");
    }
}
