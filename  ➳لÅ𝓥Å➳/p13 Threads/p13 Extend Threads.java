//Threads allow a program to operate more efficiently by doing multiple things at the same time
//Threads can be used to perform complicated tasks in the background without interrupting the main program


//If the class extends the Thread class, the thread can be run by creating an instance of the class and 
// call its start() method:

//thread created by created by extending the Thread class and overriding its run() method:

public class MainClass extends Thread {
    public static void main(String[] args) {
      Main thread = new Main();
      thread.start();
     // The start() method is called, which internally calls the run() method in a new thread of execution.

      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
}

//implementing thread using interface

// the class implements the Runnable interface, the thread can be run by passing an instance of the class 
//to a Thread object's constructor and then calling the thread's start() method:



public class Main implements Runnable {
    public static void main(String[] args) {
      Main obj = new Main();
      Thread thread = new Thread(obj);
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
