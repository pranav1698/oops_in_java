public class StaticBlock {
    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("I am in main method");
    }

    static {
        System.out.println("I am in second static block");
    }
}
