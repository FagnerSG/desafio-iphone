package multimedia.socialmidias;

public class PhoneClassStyle implements Phone {

    public void call(String number) {
        System.out.println("LIGANDO");
    }

    public void answer() {
        System.out.println("ATENDER");
    }

    public void hangUp() {
        System.out.println("DESLIGAR");
    }
}
