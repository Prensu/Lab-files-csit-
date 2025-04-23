//Reflection is  a powerful feature used to inspect,analyze and manipulate class,methods,fields and constructors in runtime

// uses
// 1)Create objects dynamically at runtime despite knowledge of their types 
// 2)Access private/public fields for testing/frameworks
// 3)Inspect class info at runtime

import java.lang.reflect.Method;

class Student {
    public void sayHello() {
        System.out.println("Hello, Sachhyam! It's Jannat speaking.");
    }

    public void sayMouse() {
        System.out.println("Holy Shit! It's a mouse with skills.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        Class<?> obj = s.getClass();  // Gets class info

        System.out.println("Class Name: " + obj.getName());

        Method[] methods = obj.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method name: " + m.getName());
        }
    }
}

//wtf i was getting error because i compiled javac Main.java and also run Main.java but should hava been java Main only ...lol 
