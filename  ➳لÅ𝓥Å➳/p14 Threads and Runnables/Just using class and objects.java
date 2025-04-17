class A {
    public void show() {
        System.out.println("Hi");
    }
}

class B {
    public void show() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}
