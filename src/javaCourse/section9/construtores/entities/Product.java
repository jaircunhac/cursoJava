package javaCourse.section9.construtores.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // Calculate the value of the stock
    public double totalValueInStock(){
        return price * quantity;
    }

    // Add products to the stock
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    // Remove products from the stock
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
}
