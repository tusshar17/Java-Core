package RelationalOperators;

public class HelloWorld {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // less than
        boolean isLessThan = a<b;
        System.out.println("isLessThan: " + isLessThan);

        // greater than
        boolean isGreaterThan = a>b;
        System.out.println("isGreaterThan: " + isGreaterThan);

        // less than equal to
        boolean isLessThanEqualTo = a<=b;
        System.out.println("isLessThanEqualTo: " + isLessThanEqualTo);

        // greater than equal to
        boolean isGreaterThanEqualTo = a>=b;
        System.out.println("isGreaterThanEqualTo: " + isGreaterThanEqualTo);

        // equal to
        boolean isEqualTo = a==b;
        System.out.println("isEqualTo: " + isEqualTo);

        // not equal to
        boolean isNotEqualTo = a!=b;
        System.out.println("isNotEqualTo: " + isNotEqualTo);
    }
}
