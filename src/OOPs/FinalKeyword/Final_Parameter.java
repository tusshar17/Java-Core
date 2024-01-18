package OOPs.FinalKeyword;

public class Final_Parameter {

    static void sayHello(final String name){
        // name = "";   ----> will throw an error
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Final_Parameter.sayHello("World");
    }
}
