package Spring2025;

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    void calculateSalary() {

        System.out.println("Slary :" + salary);

    }

    void details() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);

    }

}

abstract class permanentEmployee extends Employee {

    int bonous;

    permanentEmployee(String name, int id, double salary) {

        super(name, id, salary);

    }

    abstract void calculateSalary();

}

public class EmployeeManagementSystem {

}
