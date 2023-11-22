package OOPs.Constructor;


class Welcome{

    Welcome(){
        System.out.println("Hello. you don't have any name? Surprising!");
    }

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
