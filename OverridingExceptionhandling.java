class Test {
    Object show() throws RuntimeException {
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

public class OverridingExceptionhandling {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        XYZ obj = new XYZ();
        obj.show();
    }
}
