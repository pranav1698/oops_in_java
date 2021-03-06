// Aggregation Relationship between two Classes
// "Has A" Relationship

class Robot {
    String name;
    String color;
    int weight;
    Robot lookingAt;

    Robot(String n, String c, int w) {
        this.name = n;
        this.color = c;
        this.weight = w;
    }

    void introduceSelf() {
        System.out.println("My name is " + this.name);
    }
}

class Person {
    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned;

    Person(String n, String p, boolean i) {
        this.name = n;
        this.personality = p;
        this.isSitting = i;
    }

    void sitDown() {
        this.isSitting = true;
    }

    void standUp() {
        this.isSitting = false;
    }
}

public class AggregationClass {
    public static void main(String[] args) {
        Robot r1 = new Robot("Tom", "red", 30);
        Robot r2 = new Robot("Jerry", "blue", 40);

        r1.introduceSelf();
        r2.introduceSelf();
        r1.lookingAt = r2;
        r2.lookingAt = r1;

        Person p1 = new Person("Alice", "aggressive", false);
        Person p2 = new Person("Becky", "talkative", true);

        p1.robotOwned = r2;
        p2.robotOwned = r1;

        p1.robotOwned.introduceSelf();
        p2.robotOwned.introduceSelf();
    }
}
