package DAY_11;

// Programe for 3 D array:
public class Array3D {

    public static void main(String[] args) {

        int arr[][][] = { { { 12, 34, 57 }, { 56, 45, 78 }, { 90, 45, 56 }, { 78, 90, 67 } } };
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 3; k++) {

                    System.out.print(arr[i][j][k] + " | "); //3 D array print

                }
                System.out.println();
               
            }
        }
    }
}