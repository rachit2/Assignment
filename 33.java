class  Cal extends Thread
{
	private int a;
	private int n;
	
	Cal(int a,int n)
	{
		this.n=n;
		this.a=a;
	
	}
	public void run()
	{ 
	result(a,n);
           
	}
	synchronized public void result(int a,int n)
	{
		while(a<=n)
		{
			System.out.println("Square of"+a+" is:"+a*a);
		 a++;
	}
}
}
class Sq
{
	public static void main(String ar[])
	{
		Cal c1=new Cal(1,50);
		Cal c2=new Cal(51,100);
		c1.start();
		try
		{
			c1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		c2.start();
	}
}