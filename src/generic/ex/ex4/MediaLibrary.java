package generic.ex.ex4;

public class MediaLibrary<T extends Media> {
    Media[] mediaArray = new Media[10];
    int index = 0;

    void addMedia(T media) {
        mediaArray[index++] = media;
    }

    void printMediaTitles() {
        for (int i = 0; i < index; i++) {
            System.out.println(mediaArray[i].getTitle());
        }
    }

}
