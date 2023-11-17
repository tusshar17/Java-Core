package Arrays.TwoD;

public class Demo {

    public static void main(String[] args) {

        int num [][];
        num = new int[3][4];

        num[0][0] = 11;
        num[0][1] = 12;
        num[0][2] = 13;
        num[0][3] = 14;
        num[1][0] = 21;
        num[1][1] = 22;
        num[1][2] = 23;
        num[1][3] = 24;
        num[2][0] = 31;
        num[2][1] = 32;
        num[2][2] = 33;
        num[2][3] = 34;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        int[][] num2 = {{11, 22, 33, 44}, {55, 66, 77, 88}};
        int rowSize = num2.length, columnSize = num2[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(num2[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
