import java.util.ArrayList;

public class MainOrganizer {
    private ArrayList<Track> tracks;
    private MusicPlayer player;
    private TrackReader trackReader;

    public MainOrganizer() {
        tracks = new ArrayList<>();
        player = new MusicPlayer();
        trackReader = new TrackReader();
    }

    public void addTrack(String folderPath) {
        tracks.addAll(trackReader.readTracks(folderPath));
        System.out.println("Music library loaded. " + tracks.size() + " tracks.");
    }

    public void listAllTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks available.");
        } else {
            System.out.println("Track listing:");
            for (int i = 0; i < tracks.size(); i++) {
                System.out.println((i + 1) + ". " + tracks.get(i).getTitle());
            }
        }
    }

    public void playTrack(int number) {
        number = number - 1;
        if (number >= 1 && number < tracks.size()) {
            Track track = tracks.get(number);
            System.out.println("Playing file: " + track.getFilePath());
            System.out.println("Now playing: " + track.getTitle());
            player.play(track);
        } else {
            System.out.println("Invalid track number.");
        }
    }

    public void stopPlaying() {
        System.out.println("Stopping the current track.");
        player.stop();
    }

    public static void main(String[] args) {
        MainOrganizer organizer = new MainOrganizer();

        organizer.addTrack("../music");

        organizer.listAllTracks();

        organizer.playTrack(1);

        organizer.playTrack(1);

        organizer.stopPlaying();

        organizer.playTrack(2);
    }
}
