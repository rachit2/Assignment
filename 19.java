class Bank
{
 private int acno,bal;
 public Bank(int acno,int bal)
 {
   this.acno=acno;
   this.bal=bal;
 }
 synchronized public void withdraw(int amt)
 {
  if(bal>=amt)
  {
   System.out.println("Transaction complete for acno="+acno);
   System.out.println("\nCollect your cash:"+amt+" for acno= "+acno);
   bal=bal-amt;
   System.out.println("\nRemaining balance="+bal+" for acno= "+acno);
  }
  else
  System.out.println("\nInsufficient balance for acno="+acno);
 }
}
class Atm extends Thread
{
 private Bank ob;
 public Atm(Bank ob)
 {
   this.ob=ob;
 }
 public void run()
 {
   ob.withdraw(8000);
 }
}
class sbidemo
{
 public static void main(String ar[])
 {
   Bank ac1=new Bank(101,10000);
   Bank ac2=new Bank(102,30000);
   Atm c1=new Atm(ac1);
   Atm c2=new Atm(ac1);
   Atm c3=new Atm(ac2);
   c1.start();
   c2.start();
   c3.start();
 }
}