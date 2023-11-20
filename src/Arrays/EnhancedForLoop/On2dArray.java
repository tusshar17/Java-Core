package Arrays.EnhancedForLoop;

public class On2dArray {


    public static void main(String[] args) {
        
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,2}};

        for (int[] row: array) {
            for (int element : row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
