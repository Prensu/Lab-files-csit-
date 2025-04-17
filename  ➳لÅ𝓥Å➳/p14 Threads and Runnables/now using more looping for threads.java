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

        obj1.start();
        obj2.start();
    }
}


//now i increased the loop to ssee how much changed has the threadin made and damn it made the changes 

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
// Hi
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
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hello


//The output came like this so we can see threading (multitasking is performed and well its good)