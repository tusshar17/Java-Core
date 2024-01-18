package OOPs.FinalKeyword;


class Example{

    static final int num; // declaring static final variable

    // initializing static final variable using static block
    static{
        num = 101;
    }

}

public class Final_Static_Variable {

    public static void main(String[] args) {

        // Example.num = 100;  //---> will throw an error

        System.out.println(Example.num);
    }

}
