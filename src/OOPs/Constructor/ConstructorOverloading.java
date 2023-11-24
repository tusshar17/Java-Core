package OOPs.Constructor;


class Welcome{

    // constructor without parameter
    Welcome(){
        System.out.println("Hello. you don't have any name? Surprising!");
    }


    // constructor with single parameter
    Welcome(String name){
        System.out.println("Hello " + name + " :)");
    }

    // constructor with 2 parameter
    Welcome(String name, String city){
        System.out.println("Hello " + name + " from " + city + " :)");
    }

}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Welcome obj1 = new Welcome();
        Welcome obj2 = new Welcome("Sam");
        Welcome obj3 = new Welcome("Sam", "UP");
    }
}
