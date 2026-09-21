public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public void printInfo() {
        System.out.println(title+ "by" + artist + " (" + duration + "seconds)");
    }
}
