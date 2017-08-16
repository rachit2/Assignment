class Second
{
  public synchronized void print(int n)
  {
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println(n*i);
	  try { Thread.sleep(500);
	  
	  }catch(Exception e){System.out.println(e);}
	    
	  }
  }
}
 class Third extends Thread
 {
	 Second d;
	 Third(Second d)
	 {
		this.d=d;
	 }
   public void run()
   {
	   d.print(5);
   }
 
 }
 
 
 class Fourth extends Thread
 {
	 Second d;
	 Fourth(Second d)
	 {
		this.d=d;
	 }
	 public void run()
	   {
		   d.print(10);
	   }
	 }
   class Main2
  {
	 public static void main(String args[])
	 {
		 Second d=new Second();
		 Third ob1=new Third (d);
		 Fourth ob2=new  Fourth(d);
	     ob1.start();
	     ob2.start();
	 }
  }