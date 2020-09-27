class Test {
    Object show() {
        System.out.println("1");
        return null;
    }
}

class XYZ extends Test {
    String show() {
        System.out.println("2");
        return "";
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        XYZ obj = new XYZ();
        obj.show();
    }
}
