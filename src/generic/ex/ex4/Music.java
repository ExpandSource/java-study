package generic.ex.ex4;

public class Music implements Media{
    private String title;
    String artist;

    @Override
    public String getTitle() {
        return title;
    }
}
