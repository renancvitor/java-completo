package Entites;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    Employee() {
    }

    public Employee(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hours = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }
}
