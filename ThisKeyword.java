class ThisDemo {
    ThisDemo(Test t) {
        System.out.println("This Demo Class Constructor");
    }
}

class Test {
    int i;

    Test() {
        this(10);
        System.out.println("no arg constructor");
    }

    Test(int a) {
        System.out.println("parameterised constructor!!");
    }

    void m1(Test t1) {
        System.out.println(t1);
    }

    // can be used to return current instance of the class
    Test m2() {
        m1(this);
        return this;
    }

    void setValue(int i) {
        this.i = i;
    }

    void display() {
        System.out.println("hello");
    }

    void show() {
        // if we don't use the this keyword, the compiler implimcitly automatically adds
        // this
        // keyword while invoking the method
        display();
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.m2();

        ThisDemo td = new ThisDemo(obj);
    }
}
