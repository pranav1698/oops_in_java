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

class C extends B {
    void showC() {
        System.out.println("C class method");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new C();

        // Because C extends B and B extends A, we can call
        // all methods of B and A if we create an object of
        // subclass C
        c.showA();
        c.showB();
        c.showC();
    }
}
