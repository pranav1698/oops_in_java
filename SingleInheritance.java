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

public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}
