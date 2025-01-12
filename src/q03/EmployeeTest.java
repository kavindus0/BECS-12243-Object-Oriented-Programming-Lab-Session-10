package q03;

import Employee;

public class EmployeeTest { 

    public static void main(String[] args) { 

        Employee emp1 = new Employee("Saman", 1000.0); 

        Employee emp2 = new Employee("Amal", 2500.0); 

        Employee emp3 = new Employee("Kamala", 1250.0); 

         

        System.out.println("Name: " + emp1.getName() + ", ID: " + emp1.getIdNumber() + ", Pay Rate: Rs." + emp1.getPayRate()); 

        System.out.println("Name: " + emp2.getName() + ", ID: " + emp2.getIdNumber() + ", Pay Rate: Rs." + emp2.getPayRate()); 

        System.out.println("Name: " + emp3.getName() + ", ID: " + emp3.getIdNumber() + ", Pay Rate: Rs." + emp3.getPayRate()); 

         

        System.out.println(emp1.getName() + "'s Pay for 40 hours: Rs." + emp1.calcPay(40)); 

        System.out.println(emp2.getName() + "'s Pay for 35 hours: Rs." + emp2.calcPay(35)); 

        System.out.println(emp3.getName() + "'s Pay for 20 hours: Rs." + emp3.calcPay(20)); 

         

        System.out.println("Total Employees: " + Employee.numberOfEmployees()); 

    } 

} 

 

 

 
