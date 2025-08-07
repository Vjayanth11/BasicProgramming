package objectorientation.musicplayer;

public class Song implements Playable {
    private String title;
    private String artist;
    private int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void play() {
        System.out.println("Now Playing: " + title + " by " + artist + " (" + durationInSeconds + "s)");
    }
}
