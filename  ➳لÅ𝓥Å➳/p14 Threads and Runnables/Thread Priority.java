class A extends Thread {
    public void run() {
        for(int i=1;i<50;i++)
        {
        System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=1;i<50;i++)
        {
        System.out.println("Hello");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj2.setPriority(Thread.MAX_PRIORITY);  //Thread priority is an integer value (1 to 10) that tells the thread scheduler which threads should get more CPU time.


        obj1.start();
        obj2.start();
    }
}
//Higher priority threads get preference but are not guaranteed to execute first (depends on the OS).
//usually ued to suggest which thread is more important like 


// 1)To suggest which threads are more important (e.g., UI updates > background tasks).
// 2)Helps in optimizing CPU usage for critical tasks.

