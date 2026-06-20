package multimedia.players;

public class MusicPlayerClassStyle implements MusicPlayer {
    public void play() {
        System.out.println("playing");
    }

    public void pause(){
        System.out.println("paused");
    }

    public void stop() {
        System.out.println("stoped");
    }

    public void next() {
        System.out.println("proximo");
    }

    public void previous() {
        System.out.println("anterior");
    }
}
