package Entities;

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

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return -name.compareTo(other.getName());
        // Usando o sinal de menos (-) você compara em ordem decrescente
        // Trocando 'name' por 'salary e get'Name' por get'Salary' você compara salário
    }
}
