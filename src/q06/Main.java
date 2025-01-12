﻿public class Main {
     
    public static void main(String[] args) {
        
        Dish dish1 = new Dish("Pasta", 150.0);
        Dish dish2 = new Dish("Burger", 100.0);
        Dish dish3 = new Dish("Pizza", 250.0);

  
        Order order1 = new Order(dish1, 2);
        Order order2 = new Order(dish2, 3);
        Order order3 = new Order(dish3, 1);

      
        Restaurant restaurant = new Restaurant(5);

     
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        restaurant.addOrder(order3);

       
        Order order4 = new Order(dish1, 5);
        restaurant.addOrder(order4);
    }
}
