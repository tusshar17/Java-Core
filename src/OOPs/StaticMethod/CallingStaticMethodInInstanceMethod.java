package OOPs.StaticMethod;

class Example{
    static void sayHi(){
        System.out.println("Hi, from a static method of external class.");
    }


}


public class CallingStaticMethodInInstanceMethod {

    // static method inside same class
    static void sayHello(){
        System.out.println("Hello, from a static method inside same class.");
    }


    void instanceMethod(){

        // calling internal static method
        sayHello();

        // calling external static method using class name
        Example.sayHi();

        // calling external static method using object name
        Example obj = new Example();
        obj.sayHi();

    }


    public static void main(String[] args) {
        CallingStaticMethodInInstanceMethod obj2 = new CallingStaticMethodInInstanceMethod();
        obj2.instanceMethod();
    }
}
