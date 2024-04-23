package Entities;

public class Data {

    private String name;
    private double firstGrade;
    private double secondGrade;

    public Data(String name, double firstGrade, double secondGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public String getName() {
        return name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double average() {
        return (firstGrade + secondGrade) / 2.0;
    }
}
