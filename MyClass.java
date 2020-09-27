class Robot {
    String name;
    String color;
    int weight;

    Robot(String n, String c, int w) {
        this.name = n;
        this.color = c;
        this.weight = w;
    }

    void introduceSelf() {
        System.out.println("My name is " + this.name);
    }

}

public class MyClass {
    public static void main(String[] args) {
        Robot r1 = new Robot("Tom", "red", 30);
        Robot r2 = new Robot("Jerry", "blue", 40);

        r1.introduceSelf();
        r2.introduceSelf();
    }
}