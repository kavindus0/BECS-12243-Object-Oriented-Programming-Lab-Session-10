package q02;

public class PointClient { 

    public static void main(String[] args) { 

        Point p1 = new Point(20, 2); 

        Point p2 = new Point(3, 6); 
         
        System.out.println("Point 1: " + p1.displayPoint()); 

        System.out.println("Point 2: " + p2.displayPoint()); 

        System.out.println("Distance of p2 from origin: " + p2.distance()); 

        System.out.println("Distance between p1 and p2: " + p2.distance(p1)); 

    } 

} 
