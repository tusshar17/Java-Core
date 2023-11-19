package BreakStatement;

public class LabeledContinue {

    public static void main(String[] args) {

        // without label
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if(i==2) continue;
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // with label
        label:
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if(i==2) continue label;
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
