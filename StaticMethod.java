class Test {
    int i = 10;
    static int j = 20;

    static void display() {
        // System.out.println(i); This will cause error, as static method can only
        // access static data

        // System.out.println(this.j); Static method cannot refer to this and super
        // keyword

        // show(); Static method cannout call non-static method, because show method
        // calls only
        // static method
    }

    void show() {
        System.out.println("In show method");
    }
}

class XYZ {
    static void show() {
        System.out.println("2");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Test t = new Test();
        // t.display();
        Test.display();
        XYZ.show();
    }
}
