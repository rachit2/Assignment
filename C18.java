import java.util.Arrays;
 
 
 
public class ArraysSortExample {
 
    public static void main(String...a){
 
        Integer intArray[]={2,3,1};
       
        System.out.print("Array before sorting : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
        Arrays.sort(intArray);
       
        System.out.print("\nArray after sorting : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
 
       
    }
}