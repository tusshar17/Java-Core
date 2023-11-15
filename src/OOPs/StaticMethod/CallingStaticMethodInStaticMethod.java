package OOPs.StaticMethod;


class Demo{
    static void sayHi(){
        System.out.println("Hi, from a static method of external class.");
    }
}

public class CallingStaticMethodInStaticMethod {


    // static method inside same class
    static void sayHello(){
        System.out.println("Hello, from a static method inside same class.");
    }

    public static void main(String[] args) {
        // calling static method of same class
        sayHello();

        // calling static method of external class
        Demo.sayHi();
    }
}
