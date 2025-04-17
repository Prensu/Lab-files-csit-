class A implements Runnable {
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
            
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start(); // start thread A
        t2.start(); // start thread B
    }
}


