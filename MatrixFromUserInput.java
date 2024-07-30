import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void printMatrix(int[][] matrix, int row, int column);
}

class MatrixFromUserInput {    
    public static void main(String... args) {
		
        Printer p = (matrix, row, column) -> {
			
            System.out.println("The Matrix will be: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter elements: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        p.printMatrix(matrix, n, n);
    }
}
