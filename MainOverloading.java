class MainOverloading {
    public static void main(String[] args) {
        System.out.println("1");
        MainOverloading obj = new MainOverloading();
        obj.main(10);
    }

    public static void main(int a) {
        System.out.println("2");
    }
}
