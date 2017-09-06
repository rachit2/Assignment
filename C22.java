import java.util.TreeSet;
import java.util.Set;
 
 
/**
 * @author AnkitMittal
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class
 */
public class SortSetExample {
 
    public static void main(String...a){
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
 
        System.out.println("treeSet : "+treeSet);
 
       
    }
}