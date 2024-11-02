class Employee {
    int emp;
    String name;
    float sal;

    Employee() {
        System.out.println("***");
        emp = 101;
        name = "vanshi";
        sal = 5000f;

    }

    void displayDetails() {
        System.out.println(emp + "|" + name + "|" + sal);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
