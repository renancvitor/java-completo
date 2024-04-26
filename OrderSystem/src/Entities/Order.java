package Entities;

import EntitiesEnums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date monet;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date monet, OrderStatus status) {
        this.id = id;
        this.monet = monet;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getMonet() {
        return monet;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMonet(Date monet) {
        this.monet = monet;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", monet=" + monet +
                ", status=" + status +
                '}';
    }
}
