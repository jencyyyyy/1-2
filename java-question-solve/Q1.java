class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return "Name: " + name + ", Salary: " + salary;
  }
}

class Manager extends Employee {
  private String department;

  public Manager(String name, double salary, String department) {
    super(name, salary);
    this.department = department;
  }

  public String toString() {
    return super.toString() + ", Department: " + department;
  }
}

class Executive extends Manager {

  public Executive(String name, double salary, String department) {
    super(name, salary, department);
  }

  public String toString() {
    return "Executive: " + super.toString();
  }
}

public class Q1 {
  public static void main(String[] args) {
    Employee emp = new Employee("Meena", 10000);
    System.out.println(emp.toString());

    Manager mng = new Manager("Raju", 20000, "Sales");
    System.out.println(mng.toString());

    Executive exec = new Executive("Mithu", 30000, "Marketing");
    System.out.println(exec.toString());
  }
}