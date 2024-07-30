import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void arrayFromUser(int arr[],int n);
}

class ArrayFromUserInput {    
    public static void main(String... args) {
        Printer p = (arr,n) -> {
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+ " ");
			} 
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the element: "+i);
			arr[i]=sc.nextInt();
		}
        p.arrayFromUser(arr,n);
        
    }
}
