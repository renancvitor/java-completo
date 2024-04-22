package Entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Para incluir os controladores de forma automática clique com o botão direito na linha de códigos e
    //procure por "Generete" e então cliquei em "Constructor"

    //E para incluir os setters e getters de forma automática clique com o botão direito na linha de códigos e
    //procure por "Generete" e então clique em "Setters" escolhendo quais 'privetes' quer incluir, e da mesma
    //forma para os "Getters".

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Product() {
//    }
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units. Total: $ " + String.format("%.2f",totalValueInStock());
    }
}