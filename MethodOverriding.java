class Test1 {
    void show() {
        System.out.println("1");
    }
}

class XYZ extends Test1 {
    void show() {
        System.out.println("2");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();

        XYZ obj = new XYZ();
        obj.show();
    }
}
