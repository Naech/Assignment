public class EmployeeTest{

    public static void main(String args[]){

    Employee employee1 = new Employee("Mark", "Zayn", 45);
    Employee employee2 = new Employee("Max", "White", 25);

    System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " salary is " + employee1.getSalary());
    System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " salary is " + employee2.getSalary());

    employee1.employeeSalaryRaise();
    employee2.employeeSalaryRaise();

    System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " salary is " + employee1.getSalary());
    System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " salary is " + employee2.getSalary());


    }
}