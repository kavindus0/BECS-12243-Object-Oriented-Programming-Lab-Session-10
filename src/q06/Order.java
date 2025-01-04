public class Order {
    private Dish dish;
    private int quantity;
    
    public Order(Dish dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }
    
    public double calculateTotal() {
        return dish.getPrice() * quantity;
    }
    
    public void displayOrder() {
        System.out.println(quantity + "x " + dish.getName() + " - Rs." + calculateTotal());
    }
}

