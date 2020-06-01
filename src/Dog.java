public class Dog {
    String name;
    String rasa;

    String zaszczekaj() {
        return "Hau hau !!";
    }

    int skacz() {
        this.zaszczekaj();
        return 5;
    }

    String skaczIlesRazy(int ilosc) {
        return "Skaczę " + ilosc + " razy !!";
    }

    String skaczIlesRazy2(int ilosc) {
        return "Skaczę " + ilosc + 1 + " razy !!";
    }

    String skaczIlesRazy3(int ilosc, int ilosc2) {
        return "Skaczę " + ilosc + ilosc2 + " razy !!";
    }

    void wypisz() {
        System.out.println("Wypisuję !!");
    }
}
