public class MethodOveriding {
    void show(String a, int b) {
        System.out.println("1");
    }

    void show(int a, String b) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOveriding obj = new MethodOveriding();
        obj.show(10, "20");
    }
}
