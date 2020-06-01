public class Square {
    int a;
    int field;

    Square(int a) {
        this.a = a;
    }

    Square(int a , int field) {
        this(a, 5.5);
        this.field = a*a;
    }

    Square(int a, double b) {
        this.field = 0;
    }

    Square() {
    }
}
