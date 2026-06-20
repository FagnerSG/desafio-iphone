import multimedia.browsers.Browser;
import multimedia.mediaplayers.Iphone;
import multimedia.players.MusicPlayer;
import multimedia.socialmidias.Phone;

public class Main {
    public static void main(String[] args) {

        Iphone smartphone = new Iphone();

        MusicPlayer mp = smartphone;
        Phone tel = smartphone;
        Browser navegador = smartphone;

        String chamarNumber = "12345";
        String url = "FireFox";

        mp.play();
        tel.call(chamarNumber);
        navegador.openURL(url);

    }
}