import java.util.Set;
import java.util.TreeSet;
 
 
class Employee implements Comparable<Employee>{
    String name;
    String id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public int compareTo(Employee otherEmployee) {
       //sort Employee on basis of name(ascending order)
       return this.name.compareTo(otherEmployee.name);
    }
 
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
}