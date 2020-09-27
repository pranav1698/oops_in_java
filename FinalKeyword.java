final class Demo {
    // as the Demo class is final it cannot be inherited by any other class
    final void m1() {
        System.out.println("I'm in class Demo");
    }
}

class Test extends Demo {
    // as the m1 method in final,
    // it will cannot overide compile time error
    void m1() {
        System.out.println("I'm in class Test");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
