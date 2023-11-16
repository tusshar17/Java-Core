package Arrays.OneD;

public class Test {


    public static void main(String[] args) {

        int[] num = new int[5];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;


        for (int i = 0; i <5; i++) {
            System.out.println("Element at " + i + " index: " + num[i]);
        }

        // length of array
        int lengthOfNum = num.length;
        System.out.println("Length of array is: " + lengthOfNum);

    }
}
