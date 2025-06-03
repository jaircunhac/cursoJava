package javaCourse.section9.construtores.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
