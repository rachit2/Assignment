import java.util.Arrays;
import java.util.Comparator;
 
class Employee{
    String name;
    String id;
   
    public Employee() {}
   
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
   
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
   
}
 
 
 
class ComparatorName implements Comparator<Employee>{
    @Override
    public int compare(Employee obj1, Employee obj2) {
       //sort Employee on basis of name(ascending order)
       return obj1.name.compareTo(obj2.name);
    }
   
}
 
 
 
class ComparatorId implements Comparator<Employee>{
    @Override
    public int compare(Employee obj1, Employee obj2) {
       //sort Employee on basis of id(ascending order)
       return obj1.id.compareTo(obj2.id);
    }
   
}
 
 
 
/**
 * @author AnkitMittal
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class
 */
public class ArraysSortExample {
    public static void main(String[] args) {
 
           Employee emp1 = new Employee("sam", "4");
           Employee emp2 = new Employee("amy", "2");
           Employee emp3 = new Employee("brad", "1");
 
           Employee employeeArray[] = { emp1, emp2, emp3 };
 
           System.out.print(" employeeArray Before sorting : \n");
           for (Employee emp : employeeArray) {
                  System.out.print(emp + "  ");
           }
 
           Arrays.sort(employeeArray, new ComparatorName());
           System.out.println("\n\n employeeArray after sorting on basis of "
                        + "name(ascending order) : ");
           for (Employee emp : employeeArray) {
                  System.out.print(emp + "  ");
           }
 
           Arrays.sort(employeeArray, new ComparatorId());
           System.out.println("\n\n employeeArray after sorting on basis of "
                        + "id(ascending order) : ");
           for (Employee emp : employeeArray) {
                  System.out.print(emp + "  ");
           }
 
    }
}