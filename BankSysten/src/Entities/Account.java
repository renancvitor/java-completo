package Entities;

public class Account {

    private Integer number;
    private String name;
    protected Double balance;

    Account() {
    }

    public Account(Integer number, String name, Double nalance) {
        this.number = number;
        this.name = name;
        this.balance = nalance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
