class A {
    int i = 10;

    A() {
        System.out.println("I'm in class A");
    }

    void m1() {
        System.out.println("I'm in class A");
    }
}

class B extends A {
    int i = 20;

    B() {
        // Compiler automataically adds super keyword here
        // to create an instance of the parent class
        System.out.println("I'm in class B");
    }

    void m1() {
        System.out.println("I'm in class B");
    }

    void show(int i) {
        System.out.println(i); // Local Variable
        System.out.println(this.i); // Current Instance Variable
        System.out.println(super.i); // Parent Class Variable
        m1(); // Overriden method
        super.m1();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B ob = new B();
    }
}