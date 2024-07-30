import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void sumOfMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns);
}

class SumOfTwoMatrices {    
    public static void main(String... args) {
		
        Printer p = (matrix1, matrix2, rows, columns) -> {
			
            int[][] resultMatrix = new int[rows][columns];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrices: ");
        int n = sc.nextInt();
        
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

       p.sumOfMatrices(matrix1, matrix2, n, n);
    }
}
