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

    permanentEmployee(String name, int id, double salary, int bonous) {

        super(name, id, salary);
        this.bonous = bonous;

    }

    abstract void calculateSalary();

}

class contractEmployee extends Employee {

    int contractPeriod;

    contractEmployee(String name, int id, double salary, int contractPeriod) {

        super(name, id, salary);
        this.contractPeriod = contractPeriod;

    }

    void calculateSalary() {

        System.out.println("Contract Salary :" + salary);

    }

}

class Femployee extends permanentEmployee {

    Femployee(String name, int id, double salary, int bonous) {

        super(name, id, salary, bonous);

    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary :" + salary);
    }

}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new Femployee("Emon", 1001, 15500, 2000);
        Employee e2 = new contractEmployee("Promit", 1002, 12000, 2);

        e1.details();
        e1.calculateSalary();

        System.out.println();

        e2.details();
        e2.calculateSalary();

    }

}
