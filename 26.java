class  Cal extends Thread
{
	private int a,b,sum;
	
	Cal(int a)
	{
		this.a=a;
		b=1;
		sum=0;
	}
	public void run()
	{
		System.out.println(a+" is a "+result(a)+" number");
	}
	synchronized public String result(int a)
	{
		String ans="";
		while(b<=a-1)
		{
			if(a%b==0)
				sum=sum+b;
			b++;
		if(sum==a)
		{
			ans="Perfect";
		}	
		else
		{
		 ans="Not a perfect";
		}
		
		
	}
	return ans;
}
}
class perf
{
	public static void main(String ar[])
	{
		Cal c1=new Cal(5);
		Cal c2=new Cal(6);
		c1.start();
		c2.start();
		try
		{
			c1.join();
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}