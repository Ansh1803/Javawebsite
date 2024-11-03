import java.util.ArrayList;

class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class MusicLibrary {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
    }

    public void playRandomSong() {
        if (!songs.isEmpty()) {
            int index = (int) (Math.random() * songs.size());
            System.out.println("Playing: " + songs.get(index).getTitle());
        } else {
            System.out.println("No songs available to play.");
        }
    }
}

public class MusicLibraryExample {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("Song 1"));
        library.addSong(new Song("Song 2"));
        
        library.playRandomSong();
    }
}

/*
Output:
Playing: Song 1
or
Playing: Song 2
*/
