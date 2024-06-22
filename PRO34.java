
/**
 * Create class Employee_Detail with attributes Employee_ID, Name, Designation,
 * and Salary. Write a program to read the detail from user and print it.
 * 
 */
import java.util.*;

public class PRO34 {
    public static void main(String[] args) {
        Employee_Detail emp = new Employee_Detail();
        emp.printDetails();
    }
}

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    Employee_Detail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee_ID ::");
        this.Employee_ID = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        System.out.print("Enter Employee Name ::");
        this.Name = sc.nextLine();
        System.out.print("Enter Employee Designation ::");
        this.Designation = sc.nextLine();
        System.out.print("Enter Employee Salary ::");
        this.Salary = sc.nextDouble();
        sc.close();
    }

    public void printDetails() {
        System.out.println(" Employee_ID :" + Employee_ID);
        System.out.println(" Employee_Name :" + Name);
        System.out.println(" Designation :" + Designation);
        System.out.println(" Employee_Salary :" + Salary);
    }
}
