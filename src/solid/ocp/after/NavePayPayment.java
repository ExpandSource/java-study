package solid.ocp.after;

// 새로운 결제방법 확장에는 열려있다.
public class NavePayPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("네이브 페이 결제..");
    }
}
