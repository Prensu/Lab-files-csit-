class A extends Thread {
    public void run() {  //run is used because start will call run() method its a necessity
        for(int i=1;i<10;i++)
        {
        System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=1;i<10;i++)
        {
        System.out.println("Hello");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

//but still i got the similar output no sign of difference in use of thread 
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello


