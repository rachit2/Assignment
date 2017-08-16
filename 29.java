class  Cal extends Thread
{
	private char a;
	private char n;
	Cal(char a,char n)
	{
		this.n=n;
		this.a=a;
		
	}
	public void run()
	{ 
	result(a,n);
           
	}
	synchronized public void result(char a,char n)
	{
		String ans="";
		while(a<=n)
		{
				System.out.println(a);
        	a++;
		
	}
	
}
}
class Alphabets
{
	public static void main(String ar[])
	{
		Cal c1=new Cal('A','Z');
		Cal c2=new Cal('a','z');
        System.out.println("Uppercase Letters:\n================\n");
		c1.start();
		
		try
		{
			c1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
        System.out.println("\n================\nLowerCase Letters:\n================\n");
		c2.start();
	}
}