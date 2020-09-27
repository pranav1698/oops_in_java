class Test {
    void show(int a, float b) {
        System.out.println(" int float method called ");
    }
}

public class MethodOverloadingCase {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 10);
    }
}