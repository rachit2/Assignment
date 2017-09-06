import java.util.Arrays;
import java.util.Comparator;
 
 
class SortDescending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
           //using Comparator to sort array in descending order.
           return o2.compareTo(o1);
    }
}
 
/**
 * @author AnkitMittal
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class
 */
public class ArraysSortExample {
 
    public static void main(String...a){
 
        Integer intArray[]={2,3,1};
       
        System.out.print("Array before sorting : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
        Arrays.sort(intArray, new SortDescending());
       
        System.out.print("\nArray after sorting in descending order : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
 
       
    }
}