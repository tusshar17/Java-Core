package OOPs.Constructor;


class Greet{

    // parameterized constructor
    Greet(String name){
        System.out.println("Hello, " + name);
    }
}


public class ParameterizedConstructor {

    public static void main(String[] args) {

        Greet obj = new Greet("World");
    }
}
