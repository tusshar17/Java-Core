package OOPs.MethodOverloading;

class Overloading{

    void check(int a, int b){
        System.out.println("Both Parameters are integers.");
    }

    void check(double a, double b){
        System.out.println("Both Parameters are doubles.");
    }

    void check(int a, float b){
        System.out.println("One parameter is integer and another one is float.");
    }
}

public class TypeOfParameter {

    public static void main(String[] args) {

        Overloading obj = new Overloading();

        obj.check(1,2);
        obj.check(1, 2.0f);
        obj.check(1.0, 2.0);
    }
}
