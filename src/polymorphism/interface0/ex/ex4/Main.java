package polymorphism.interface0.ex.ex4;

public class Main {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("동해물과 백두산이~");
        }
    }
}
