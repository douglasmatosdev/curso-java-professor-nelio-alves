package entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {

        return name.compareTo(otherEmployee.getName());
    }
// ordenando por salario em ordem crescente
//    @Override
//    public int compareTo(Employee otherEmployee) {
//
//        return salary.compareTo(otherEmployee.getSalary());
//    }

    // ordenando por salario em ordem decrescente
//    @Override
//    public int compareTo(Employee otherEmployee) {
//
//        return -salary.compareTo(otherEmployee.getSalary());
//    }
}
