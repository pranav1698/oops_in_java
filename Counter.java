class CounterDemo {
    static int count = 0;

    CounterDemo() {
        count++;
        System.out.println(count);
    }
}

public class Counter {
    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
        // when we create c1 object, constructor will be called and the value of count
        // becomes 1, when we create c2 object, again constructor will be called and
        // count becomes 2, then 3 and so on as we create new objects
    }
}