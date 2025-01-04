public class Dish {
    private String name;
    private double price;
    
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Dish: " + name + ", Price: Rs." + price);
    }
    
    public double getPrice() { return price; }
    public String getName() { return name; }
}

