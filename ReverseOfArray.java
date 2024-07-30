import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void reverse(int[] arr, int n);
}

class ReverseOfArray {    
    public static void main(String... args) {
        Printer p = (arr, n) -> {
            int[] reversedArr = new int[n];
            for (int i = 0; i < n; i++) {
                reversedArr[i] = arr[n - i - 1];
            }
			
			System.out.println("Original Array: ");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
            System.out.println("Reversed Array: ");
            for (int i : reversedArr) {
                System.out.print(i + " ");
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        p.reverse(arr, n);

    }
}
