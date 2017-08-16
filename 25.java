class Cal extends Thread
{
   private int i;
	Cal(int i)
	{
		this.i=i;
	}
	public void run()
	{
		
		System.out.println("Factorial of "+i+"is:"+factorial(i));
		
	}

 synchronized	public int factorial(int i) { 
if (i >= 1)
        return i*factorial(i-1);
    else
        return 1;


}
	}
class Fact
{

public static void main(String[] args) {
	
Cal c1=new Cal(5);
Cal c2=new Cal(6);
c1.start ();
c2.start ();

try {
c1.join ();
}
catch (InterruptedException e) { }

}
}