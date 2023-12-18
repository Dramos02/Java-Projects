package matrix;

import java.util.Scanner;

public class findCentralBiggestSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Check for the plus sign pattern
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (array[i - 1][j] == array[i][j] && array[i][j] == array[i + 1][j] &&
                        array[i - 1][j] == array[i][j - 1] && array[i][j] == array[i][j + 1]) {
                    // Found the plus sign pattern
                    System.out.print("The biggest plus sign's center is  [" + i + "] " +
                            "["+ j + "]");
                    //System.out.print(i + ", " + (j - 1) + "], [" + i + ", " + j + "], [" + i + ", " + (j + 1) + "]");
                    //System.out.println("]");
                    System.exit(0);  // Terminate the program
                }
            }
        }

        // Plus sign not found
        System.out.println("NO PLUS SIGN FOUND");
    }
}
