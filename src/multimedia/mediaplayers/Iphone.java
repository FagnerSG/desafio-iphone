package multimedia.mediaplayers;

import multimedia.browsers.Browser;
import multimedia.players.MusicPlayer;
import multimedia.socialmidias.Phone;

public class Iphone implements Phone, Browser, MusicPlayer {
    private String currentSong ;
    private String currentNumber;
    private String currentURL;

    //Player de Musica
    @Override
    public void play() {
        System.out.println("Playing Musica Atual: " + currentSong);
    }

    @Override
    public void pause(){
        System.out.println("Musica paused");
    }

    @Override
    public void stop() {
        System.out.println("Encerrar musica");
    }

    @Override
    public void next() {
        System.out.println("Proximo musica");
    }

    @Override
    public void previous() {
        System.out.println("Musica anterior");
    }

    //Phone
    @Override
    public void call(String number) {
        this.currentNumber = number;
        System.out.println("LIGANDO: " + number);
    }

    @Override
    public void answer() {
        System.out.println("ATENDER CHAMADA");
    }

    @Override
    public void hangUp() {
        System.out.println("DESLIGAR CHAMADA");
    }

    //Browser
    @Override
    public void openURL(String url) {
        this.currentURL = url;
        System.out.println("Nova pagina: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Atualizar pagina: " + currentURL);
    }

    @Override
    public void close() {
        System.out.println("Fechar pagina");
    }
}
