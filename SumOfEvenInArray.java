import java.util.Scanner;

@FunctionalInterface
interface Printer {
    int sumOfEven(int arr[],int n);
}

class SumOfEvenInArray {    
    public static void main(String... args) {
        Printer p = (arr,n) -> {
			
			int sum=0;
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+ " ");
				if(arr[i]%2==0){
					sum+=arr[i];
				}
			}	
			return sum;
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the element: "+i);
			arr[i]=sc.nextInt();
		}
        System.out.println("the sum is: "+p.sumOfEven(arr,n));
        
    }
}
