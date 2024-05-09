package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime dueDate;
    private Double amount;

    public Installment(LocalDateTime dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(dtf) +
                " - " +
                String.format("%.2f", amount);

    }
}
