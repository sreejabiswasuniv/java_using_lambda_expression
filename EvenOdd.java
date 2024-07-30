import java.util.Scanner;
@FunctionalInterface
interface Printer{
	void evenOrodd(int n);
}

class EvenOdd{
	
	public static void main(String... args){
		Printer p=(n)->{
			
			if(n<=0)
				throw new IllegalArgumentException("Invalid number "+n);
			
			else
				System.out.println(n+( ( n%2==0)? " is even!!" : " is odd!!"));
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		p.evenOrodd(n);

		
	}
}

	
		