interface I1 {
    int a = 10;

    void show();
}

class Test implements I1 {
    public void show() {
        System.out.println("hi");
    }
}

public class Interface {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}
