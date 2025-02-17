import java.util.Scanner;

class Convert2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols]; // 2D array
        int[] array = new int[rows * cols];   // 1D array
        int index = 0;

        // Input elements for the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("Converted 1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
