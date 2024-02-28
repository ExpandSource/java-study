package polymorphism.interface0.ex.ex4;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("문자를 발송 : " + msg);
    }
}
