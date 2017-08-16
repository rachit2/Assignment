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
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
				System.out.println(a+":Vowel");
            else
              System.out.println(a+":consonant");				
			a++;
		
	}
	
}
}
class Vowel
{
	public static void main(String ar[])
	{
		Cal c1=new Cal('a','f');
		Cal c2=new Cal('g','z');
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