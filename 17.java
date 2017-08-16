class Th extends Thread
{
  String s;
  public Th(String s) //constructor of thread.., thread(String)
  {
    System.out.println("Inside Constructor");
    System.out.println("------------------------");
    this.s=s;
  }
  public void run()//this ovverrides run method which is already present in runnable interface
  {
     System.out.println("Inside Run");
    System.out.println("------------------------");
   try
   {
     for(int i=0;i<=3;i++)
    {   System.out.println(s); sleep(1000); }//sleep throws Interrupted Exception
   }
   catch(InterruptedException ex){}
  } 
}
class Thdemo
{
 public static void main(String ar[])
 {
   Th t1=new Th("One");
   Th t2=new Th("Two");
   Th t3=new Th("Three");
   System.out.println("Before start");
   System.out.println("T1 is alive=:"+t1.isAlive());
   System.out.println("T2 is alive=:"+t2.isAlive());
   System.out.println("T3 is alive=:"+t3.isAlive());
   t1.start();//t1.run() also calls to run 
   System.out.println("After t1.start");
   System.out.println("T1 is alive=:"+t1.isAlive());
   t2.start();
   System.out.println("After t2.start");
   System.out.println("T2 is alive=:"+t2.isAlive());
   t3.start();
   System.out.println("After t3.start");
   System.out.println("T3 is alive=:"+t3.isAlive());
   System.out.println("After start");
   System.out.println("T1 is alive=:"+t1.isAlive());
   System.out.println("T2 is alive=:"+t2.isAlive());
   System.out.println("T3 is alive=:"+t3.isAlive());
 }
}