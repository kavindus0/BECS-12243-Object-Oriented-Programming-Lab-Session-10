package q02;

public class Point { 

    private int x, y; 

     

    public Point(int a, int b) { 

        x = a; 

        y = b; 

    } 

     

    public String displayPoint() { 

        return "(" + x + ", " + y + ")"; 

    } 

     

    public double distance() { 

        return Math.sqrt(x * x + y * y); 

    } 

     

    public double distance(Point other) { 

        int dx = x - other.x; 

        int dy = y - other.y; 

        return Math.sqrt(dx * dx + dy * dy); 

    } 

} 

 