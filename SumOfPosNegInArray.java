import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void sumOfPosNeg(int arr[],int n);
}

class SumOfPosNegInArray {    
    public static void main(String... args) {
        Printer p = (arr,n) -> {
			
			int posSum=0, negSum=0;
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+ " ");
				
				if(arr[i]<0){
					negSum+=arr[i];
				}
				else{
					posSum+=arr[i];
				}
			}
			
			System.out.println("the sum of -ve elements is: "+negSum);
			System.out.println("the sum of +ve elements is: "+posSum);
			
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array: ");
        int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the element: "+i);
			arr[i]=sc.nextInt();
		}
		
		p.sumOfPosNeg(arr,n);
        
        
    }
}
