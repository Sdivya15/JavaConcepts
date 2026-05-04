package variables_datatypes;

public class Employee {

    static float bonus = 1000; // shared

    String name;
    double salary;

    // constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void updateSalary(double increment) {
        salary += increment;   // instance change
        bonus += 500;          // static change (TRICK)
    }

    void display() {
        double individualBonus = salary * 0.03;

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company Bonus: " + bonus);
        System.out.println("Individual Bonus: " + individualBonus);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Divya", 30000);
        Employee e2 = new Employee("Ravi", 25000);

        e1.updateSalary(2000);
        e2.updateSalary(1000);

        e1.display();
        e2.display();
    }
}