package OOPs.FinalKeyword;


class Parent{

    final void sayHello(){
        System.out.println("Hello World");
    }
}


class Child extends Parent{
/*
  ---- can not override function sayHello since it's final ----
    void sayHello(){
        System.out.println("Hello");
    }

 */
}

public class Final_Method {

    public static void main(String[] args) {
         Child obj = new Child();
         obj.sayHello();
    }
}
