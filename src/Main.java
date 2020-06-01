public class Main {
    public static void main(String[] args) {
        Customer klient;
        klient = new Customer();

        Customer klient2;
        klient2 = new Customer();

        klient.name = "Mateusz";
        klient.surname = "Bereda";
        klient.age = 29;


        klient2.age = 30;

        Customer[] klienci = new Customer[1000];

        System.out.println(klient.name);

        Customer klient3 = klient;

        System.out.println(klient3.name);

        klient.name = "Janusz";
        System.out.println(klient.name);
        System.out.println(klient3.name);
    }
}
