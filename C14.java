public class JavaHungry {
    
    public static void main(String[] args)
    {
        HashSet<Object> hashset = new HashSet<Object>();
        hashset.add(3);
        hashset.add("Java Hungry");
        hashset.add("Blogspot");
        hashset.add(3);                     // duplicate elements
        hashset.add("Java Hungry");              // duplicate elements
        System.out.println("Set is "+hashset);
    }
}