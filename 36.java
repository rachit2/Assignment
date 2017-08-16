class  Cal extends Thread
{
	private int a;
	private int n,sum;
	
	Cal(int a,int n)
	{
		this.n=n;
		this.a=a;
	sum=0;	
	}
	public void run()
	{ 
	result(a,n);
           
	}
	 public void result(int a,int n)
	{
	System.out.println("Sum of even numbers from :"+a+" to "+n+" is:");
		String ans="";
		while(a<=n)
		{
			sum=sum+a;
			a=a+2;
		
	}
	System.out.println(sum);
	
}
}
class SumEv2
{
	public static void main(String ar[])
	{
		Cal c1=new Cal(1,50);
		Cal c2=new Cal(51,100);
		c1.start();
		
		c2.start();
	}
}