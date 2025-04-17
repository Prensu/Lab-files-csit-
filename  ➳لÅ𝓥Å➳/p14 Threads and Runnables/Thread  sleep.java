class A extends Thread {
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

class B extends Thread {
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
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY); // give B higher priority

        obj1.start(); // start thread A
        obj2.start(); // start thread B
    }
}

// So what does it is it prints hi,hello, hi, hello in sequence sleep makes them wait 