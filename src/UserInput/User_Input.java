package UserInput;

// importing Scanner class
import java.util.Scanner;

public class User_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        float b;
        String c;

        System.out.println("Enter a String value: ");
        c = sc.nextLine();
        System.out.println("c = " + c);

        System.out.println("Enter an Integer value: ");
        a = sc.nextInt();
        System.out.println("a = " + a);

        System.out.println("Enter a Float value: ");
        b = sc.nextFloat();
        System.out.println("b = " + b);

    }
}
