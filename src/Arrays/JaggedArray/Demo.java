package Arrays.JaggedArray;

public class Demo {

    public static void main(String[] args) {

        int num[][] = new int[3][];

        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[1];

        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;

        num[1][0] = 4;
        num[1][1] = 5;

        num[2][0] = 6;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }


        System.out.println();


        int num2[][] = new int[3][];
        num2[0] = new int[3];
        num2[1] = new int[2];
        num2[2] = new int[1];

        int[] arr1  = {1, 2, 3};
        int[] arr2  = {1, 2, 3};
        int[] arr3  = {1, 2, 3};

        num2[0] = arr1;
        num2[1] = arr2;
        num2[2] = arr3;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
