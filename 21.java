 class NotifyTest {
    Object ob=new Object(); 

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    NotifyTest nt=new NotifyTest();

    even e=new even(nt.ob);     
    odd o=new odd(nt.ob);

    Thread t1=new Thread(e);
    Thread t2=new Thread(o);

    t1.start();     
    t2.start();
    }
}    

class even implements Runnable
{
    Object lock;        
    int i=2;

    public even(Object ob)
    {
        this.lock=ob;       
    }

    @Override
    public void run() {
    // TODO Auto-generated method stub      
        while(i<=50)
        {
            synchronized (lock) {               
            try {
                lock.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Even Thread Name-->>" + Thread.currentThread().getName() + "Value-->>" + i);
            i=i+2;              
        }           
    }       
}
} 

class odd implements Runnable
{

    Object lock;
    int i=1;    

    public odd(Object ob)
    {
        this.lock=ob;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(i<=49)
        {
            synchronized (lock) {               
            System.out.println("Odd Thread Name-->>" + Thread.currentThread().getName() + "Value-->>" + i);
            i=i+2;              
            lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }       
}