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





public class EmployeeManagementSystem {

}
