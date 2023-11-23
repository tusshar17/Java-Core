package OOPs.Constructor;


class Welcome{

    // constructor without parameter
    Welcome(){
        System.out.println("Hello. you don't have any name? Surprising!");
    }


    // constructor with parameter
    Welcome(String name){
        System.out.println("Hello " + name + " :)");
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Welcome obj1 = new Welcome();
        Welcome obj2 = new Welcome("Sam");
    }
}
