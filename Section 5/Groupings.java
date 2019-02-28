import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Groupings {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("George",25000,"IT"));
        employees.add(new Employee("Nicky",45000,"Marketing"));
        employees.add(new Employee("Amy",45000,"HR"));
        employees.add(new Employee("Tom",90000,"Marketing"));
        employees.add(new Employee("Carla",90000,"IT"));
        //group by department name

        Map<String,List<Employee>> emps =
                employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName));
        System.out.println(emps);

        //group department + average salary
        Map<String,Double> average =
                employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartmentName,averagingInt(Employee::getSalary)));
        System.out.println(average);


    }
}
class Employee{
    String name;
    int salary;
    String departmentName;

    public Employee(String name, int salary, String departmentName) {
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return name;
    }
}
