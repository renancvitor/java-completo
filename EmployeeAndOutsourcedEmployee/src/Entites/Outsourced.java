package Entites;

public class Outsourced extends Employee{

    private Double additionalCharged;

    public Outsourced() {
        super();
    }

    public Outsourced(String name, Integer hour, Double valuePerHour, Double additionalCharged) {
        super(name, hour, valuePerHour);
        this.additionalCharged = additionalCharged;
    }

    public Double getAdditionalCharged() {
        return additionalCharged;
    }

    public void setAdditionalCharged(Double additionalCharged) {
        this.additionalCharged = additionalCharged;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharged * 1.1;
    }
}
