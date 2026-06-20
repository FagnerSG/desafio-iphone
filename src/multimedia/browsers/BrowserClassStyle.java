package multimedia.browsers;

public class BrowserClassStyle implements Browser {
    public void openURL(String url) {
        System.out.println("Nova pagina");
    }

    public void refresh() {
        System.out.println("Atualizar");
    }

    public void close() {
        System.out.println("Fechar");
    }
}
