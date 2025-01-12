package q03;


    public class Employee { 

        private String name; 
    
        private int idNumber; 
    
        private double payRate; 
    
        private static int employeeCounter = 0; 
    
         
    
        public Employee(String name, double payRate) { 
    
            this.name = name; 
    
            this.payRate = payRate; 
    
            employeeCounter++; 
    
            this.idNumber = employeeCounter + 1000; 
    
        } 
    
         
    
        public double calcPay(double hours) { 
    
            return hours * payRate; 
    
        } 
    
         
    
        public static int numberOfEmployees() { 
    
            return employeeCounter; 
    
        } 
    
         
    
        public String getName() { return name; } 
    
        public int getIdNumber() { return idNumber; } 
    
        public double getPayRate() { return payRate; } 
    
    } 
    
     
    

