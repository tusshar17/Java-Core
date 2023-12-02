package OOPs.FinalKeyword;


class HelloWorld{
    final int num = 101;

    final int num2;

    HelloWorld(){
        num2 = 102;
    }
}

public class Final_Instance_Variable {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.num);
        System.out.println(helloWorld.num2);
    }
}
