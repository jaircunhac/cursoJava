package javaCourse.section8.exercise2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
