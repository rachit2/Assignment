import java.util.*;
class Th extends Thread
{
  String s;
  public Th(String s) //constructor of thread.., thread(String)
  {
    this.s=s;
  }
  public void run()//this ovverrides run method which is already present in runnable interface
  {

  System.out.println("\n==================\n");
  System.out.println(s);
  } 
}
class Thdemo4
{
 public static void main(String ar[])
 {
	 System.out.println("Thread-1\n===========================\nEnter your message:");
	 Scanner s=new Scanner(System.in);
     String s1=s.nextLine();
	 System.out.println("\nThread-2\n===========================\nEnter your message:");
    String s2=s.nextLine(); 
    Th t1=new Th(s1);
    Th t2=new Th(s2);
    t1.start();
   try{ t1.join();}catch(Exception e){}
    t2.start();
 }
}