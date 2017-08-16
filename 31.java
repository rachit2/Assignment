class  Cal extends Thread
{
	private String s;
	Cal(String s)
	{
		this.s=s;
		
	}
	public void run()
	{ 
	result(s);
           
	}
	synchronized public void result(String s)
	{
		System.out.println("Length of :"+s+": "+s.length());
	}
	
}

class len
{
	public static void main(String ar[])
	{
		Cal c1=new Cal("Rachit");
		Cal c2=new Cal("Verma");
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