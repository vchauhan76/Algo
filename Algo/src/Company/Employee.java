package Company;

import java.util.List;
import java.util.stream.Collectors;


public class Employee {

    String title;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Employee()
    {

    }

    public Employee(String title , String name, int salary) {
        this.title = title;
        this.name = name;
        this.salary = salary;
    }


    public static void main(String args[]) {


        List<Employee> empList = List.of(new Employee("Clerk", "Vishal",100),
                new Employee("Clerk", "Vishal",100),
                new Employee("Manager", "Payal",300),
                new Employee("Manager", "Payal",400),
                new Employee("Manager", "Payal",500));


        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle))
                .toString());


        System.out.println("Salary..." + empList.stream()
                .mapToInt(empl -> empl.getSalary() )
                .average()
                .getAsDouble());


    }


}
