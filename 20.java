 class PrimeThread extends Thread{
static long nextNumber=3;
static final long max = 1000;
public static int count=0;
public long thread = 100;
public static long[] primes = new long[100000]; 


public void run() {
    long myNumber;
    while ((myNumber=getNextNumber())<=max) {
        primes[0] = 2;
        if (prime(myNumber)) {

                primes[count++] = myNumber;
            }
        }
    }


public static synchronized long getNextNumber() {
    long n = nextNumber;
    nextNumber +=2;
    return n;
}

public boolean prime(long n) {
    int i;

    for (i=3; i * i<=n; i+=2)
        if (n%i==0) return false;
    return true;
}
}


 class MultiThreadedPrimeFinder {
    static final int nThreads = 2;

    public static void main(String[] args) throws InterruptedException{
        int t;
        int total = 0;
        PrimeThread[] pthreads = new PrimeThread[nThreads];
        //*Scanner kb = new Scanner(System.in);
        //*System.out.println("Enter a Positive Integer: ");
        //*long num = kb.nextLong();
        long starttime, endtime, runtime, a = 0;
        starttime = System.currentTimeMillis();
        for(int i = 0; i <10000000; i ++)
            a+=i;
        for (t=0; t<nThreads; t++)
        {
            pthreads[t] = new PrimeThread();
            pthreads[t].start();
        }

        for (t=0; t<nThreads; t++)
        {
            pthreads[t].join();
            System.out.println("Thread "+t
                    +"  Prime count: "+ pthreads[t].count);
        }
        total = PrimeThread.count;
        System.out.println("Total prime count: "+total);
        for (int i=0;i<100; i++)
            System.out.println(""+i+": "+PrimeThread.primes[i]);
        endtime = System.currentTimeMillis();
        runtime = endtime - starttime;
        System.out.println("The run time is " +runtime +" milliseconds");

    }

    }