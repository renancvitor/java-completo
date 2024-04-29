package Entities;

public class BusinessAccount extends Account {

    private Double loanLimite;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String name, Double nalance, Double loanLimite) {
        super(number, name, nalance);
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount) {
        if (amount <= loanLimite) {
            balance += amount - 10.0;
        }
    }
}
