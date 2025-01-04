public class Restaurant {
    private Order[] orders;
    private int orderCount;
    
    public Restaurant(int capacity) {
        orders = new Order[capacity];
        orderCount = 0;
    }
    
    public void addOrder(Order order) {
        if (orderCount < orders.length) {
            orders[orderCount++] = order;
            System.out.println("Order added successfully");
            order.displayOrder();
        } else {
            System.out.println("Restaurant is full");
        }
    }
}

