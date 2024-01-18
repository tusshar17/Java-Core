package OOPs.FinalKeyword;


class Demo{

    static void display(){

        final String greeting = "Hello World";

        final String msg;
        msg = "This is final message!";

        System.out.println(greeting);
        System.out.println(msg);
    }

}


public class Final_Local_Variable {

    public static void main(String[] args) {
        Demo.display();
    }


}
