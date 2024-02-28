package polymorphism.interface0.ex.ex1;

public class Main {
    public static void main(String[] args) {
        Playable mp3 = new MP3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();

        Playable cdp = new CDPlayer();
        cdp.play();
        cdp.pause();
        cdp.stop();

        // 배열 사용한 경우
        Playable[] players = { new MP3Player(), new CDPlayer() };
        for (Playable player : players) {
            player.play();
            player.pause();
            player.stop();
        }
    }
}
