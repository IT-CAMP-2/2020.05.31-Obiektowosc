public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        Customer c = new Customer();

        System.out.println(a);
        System.out.println(c);

        Customer c2 = null;
        String s = null;


        System.out.println(c2);

        int b;

        Dog pies = new Dog();
        /*String zaszczekaniePsa = pies.zaszczekaj();

        System.out.println(zaszczekaniePsa);*/
        System.out.println(pies.zaszczekaj());

        int iloscZamachan = pies.skacz();

        String skaczacyPies = pies.skaczIlesRazy(7);
        System.out.println(skaczacyPies);

        pies.wypisz();
    }
}
