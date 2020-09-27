class Employee {
    int empId;
    String name;
    static String company = "SP";

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println(empId + " " + name + " " + company);
    }
}

class Test {
    static int a = 10;

    void m1() {
        // Local variables cannot be made static
        int b = 20;
    }
}

class StaticVariable {
    public static void main(String[] args) {
        // Employee.company = "SP";
        // System.out.println(Test.a);

        Employee e1 = new Employee(101, "Amit");
        e1.display();
    }
}