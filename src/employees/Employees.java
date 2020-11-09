package employees;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agul Krishnan
 */

abstract class EmployeeData{
    int id;
    String name;
    int age;
    String designation;
    String department;
    int reportingTo;
}

class Employee extends EmployeeData{
    
    ArrayList<Employee> arr = new ArrayList<>();
    
    Employee(int id, String name, int age, String designation, String department, int reportingTo) {
        super.id = id;
        super.name = name;
        super.age = age;
        super.designation = designation;
        super.department = department;
        super.reportingTo = reportingTo;
    }

    Employee() {}
    
    void show(){
        System.out.printf("%3s %10s %3s %11s %10s %12s\n", "ID", "Name", "Age", "Designation", "Department", "Reporting To");
    }
    
    void showDetails(Employee emp){
        System.out.printf("%3d %10s %3d %11s %10s %12d\n", emp.id, emp.name, emp.age, emp.designation, emp.department, emp.reportingTo);
    }
    
    void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option to perform an operation");
        System.out.println("\n");
        System.out.println("A. Enter employee detail");
        System.out.println("B. show employee details");
        System.out.println("C. Exit");
        System.out.println("\n");
        char c = ' ';
        do{
            System.out.println("Enter an option");
            c = sc.next().charAt(0);
            switch(c){
                case 'A':
                    System.out.println("Enter the employee details");
                    arr.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
                    break;
                case 'B':
                    show();
                    for(Employee emp : arr)
                        showDetails(emp);
                    break;
                case 'C':
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
            System.out.println("\n");
        }while(c != 'C');
        System.out.println("Thank You!!");
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.menu();
    }
    
}
