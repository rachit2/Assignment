import java.util.Arrays;
import java.util.Comparator;
 
/**
 * Animal class
 */
class Animal{
    Integer height;
}
 
 
/**
 * Lion class
 */
class Lion extends Animal{
    Lion(Integer height){
           this.height=height;
    }
    
    @Override
    public String toString() {
           return "Lion [height=" + height + "]";
    }
}
 
 
/**
 * Dog class
 */
class Dog extends Animal{
 
    Dog(Integer height){
           this.height=height;
    }   
 
    @Override
    public String toString() {
           return "Dog [height=" + height + "]";
    }
 
}
 
 
/**
 * Comparator to sort animal's height in ascending order.
 */
class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
           //using Comparator to sort animal's height in ascending order.
           return o1.height.compareTo(o2.height);
    }
}
 
/**
 * @author AnkitMittal
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class
 */
public class ArraysSortExample {
 
    public static void main(String...a){
 
System.out.println("-----Sorting Lion's height -- using AnimalComparator-----");
       Lion lion1=new Lion(3);
       Lion lion2=new Lion(1);
       Lion lion3=new Lion(2);
       Lion lionArray[]={lion1, lion2, lion3};
       
 
           System.out.print(" lionArray before sorting : \n");
           for (Animal animal : lionArray) {
                  System.out.print(animal + "  ");
           }
 
           Arrays.sort(lionArray, new AnimalComparator());
           System.out.println("\n\n lionArray after sorting on basis of "
                        + "height(ascending order) : ");
           for (Animal animal : lionArray) {
                  System.out.print(animal + "  ");
           }
 
System.out.println("\n\n\n------Sorting Dog's height -- using AnimalComparator----");
       
       Dog dog1=new Dog(2);
       Dog dog2=new Dog(1);
       Dog dog3=new Dog(3);
       Dog dogArray[]={dog1, dog2, dog3};
       
 
           System.out.print(" dogArray before sorting : \n");
           for (Animal animal : dogArray) {
                  System.out.print(animal + "  ");
           }
 
           Arrays.sort(dogArray, new AnimalComparator());
           System.out.println("\n\n dogArray after sorting on basis of "
                        + "height(ascending order) : ");
           for (Animal animal : dogArray) {
                  System.out.print(animal + "  ");
           }
 
       
    }
}