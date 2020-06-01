public class Customer {
    String name;
    String surname;
    int age;
    int telephone;
    int pesel;
    Dog dog;

    void powiedzLiczbe(int liczba) {
        System.out.println("Mówię: " + liczba);
    }

    void powiedzLiczbe(double liczba) {
        System.out.println("Mówię: " + liczba);
    }

    /*String powiedzLiczbe(double liczba) {
        System.out.println("Mówię: " + liczba);
        return "BA";
    }*/

    void powiedzLiczbe(double liczba, int liczba2) {
        System.out.println("Mówię: " + liczba);
        System.out.println("Mówię: " + liczba2);
    }
}
