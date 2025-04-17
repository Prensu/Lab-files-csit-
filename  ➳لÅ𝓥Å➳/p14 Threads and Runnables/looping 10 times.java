class A {
    public void show() {
        for(int i=1;i<10;i++)
        {
        System.out.println("Hi");
        }
    }
}

class B {
    public void show() {
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

        obj1.show();
        obj2.show();
    }
}


// i wanna RUn multi threading but it is running first method show() of Class A and then only showing show() of Class B
// The output came as below now in next i will use threads 
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