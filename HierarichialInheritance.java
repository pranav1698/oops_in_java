class A {
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {
    void showB() {
        System.out.println("B class method");
    }
}

class C extends A {
    void showC() {
        System.out.println("C class method");
    }
}

public class HierarichialInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();

        C c = new C();
        c.showA();
        c.showC();
    }
}
