
// This  one extending threads 

class MyThread extends Thread {
    public void run() {
        System.out.println("Running from Thread class");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // runs in a new thread
    }
}

//Now another one implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running from Runnable interface");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); // pass the runnable to a Thread
        t.start();
    }
}




