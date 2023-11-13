package OOPs.MethodOverloading;


class OverloadingNumberOfParams{

    void check(int a, int b){
        System.out.println("Number of params: 2");
    }

    void check(int a, int b, int c){
        System.out.println("Number of params: 3");
    }
}

public class NumberOfParameters {

    public static void main(String[] args) {

        OverloadingNumberOfParams obj = new OverloadingNumberOfParams();

        obj.check(1, 2);
        obj.check(1, 2, 3);
    }
}
