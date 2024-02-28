package polymorphism.interface0.ex.ex4;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Facebook 메시지 발송 : " + msg);
    }
}
