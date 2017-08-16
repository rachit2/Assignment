class Account
{
 private int bal;
 public void deposit(int amt)
 {
  bal=bal+amt;
  System.out.println("\nCurrent balance="+bal);
 }
 public int getBal()
 {
   return bal;
 }
}
class cust extends Thread
{
 private Account ac;
 public cust(Account ac)
 {
  this.ac=ac;
 }
 public void run()
 {
  synchronized(ac)
  {
    ac.deposit(100);
  }
 }
}
class Syndemo3
{
 public static void main(String ar[])
 {
  Account ac=new Account();
  cust cu[]=new cust[5];
  for(int i=0;i<=4;i++)
  {
   cu[i]=new cust(ac);
  }
  for(int i=0;i<=4;i++)
  {
   cu[i].start();
  }
  for(int i=0;i<=4;i++)
  {
   System.out.println(" is Alive="+cu[i].isAlive());
  }
  try
  {
   for(int i=0;i<=4;i++)
   {
    cu[i].join();
  }
 }
  catch(InterruptedException ex)
  {
    System.out.println("\nTotal bal="+ac.getBal());
  }
 }
}