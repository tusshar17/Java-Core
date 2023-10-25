package LogicalOperator;

public class HelloWorld {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 2;

        // Logical AND
        boolean and = a<b && a<c;
        System.out.println("AND: " + and);

        // Logical OR
        boolean or = a<b || a>c;
        System.out.println("OR: " + or);

        // Logical NOT
        boolean not = !(5<2);
        System.out.println("NOT:" + not);
    }
}
