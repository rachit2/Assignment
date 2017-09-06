import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
 

public class MyDictionary {
    public static void main(String[] args) {
           ConcurrentSkipListMap<String, TreeSet<String>> myDictionary =
                        new ConcurrentSkipListMap<String, TreeSet<String>>();
 
           TreeSet<String> innocentMeaning = new TreeSet<String>();
           innocentMeaning.add("not responsible for an event yet suffering its consequences");
           innocentMeaning.add("not guilty of a crime");
 
           myDictionary.put("innocent", innocentMeaning);
 
           TreeSet<String> appealingMeaning = new TreeSet<String>();
           appealingMeaning.add("attractive");
           appealingMeaning.add("expressing a desire for help");
 
           myDictionary.put("appealing", appealingMeaning);
 
           System.out.println(myDictionary);
 
    }
}