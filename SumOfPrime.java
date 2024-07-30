import java.util.Scanner;
@FunctionalInterface
interface Printer{
	int sumOfPrime(int number);
}

class SumOfPrime{
	
	public static void main(String... args){
		Printer p=(number)->{
			int sum=0;
			while (number != 0) {
				int remainder=number%10;
				if( remainder==2 || remainder==3||remainder==5||remainder==7){
					sum+=remainder;
		}
			number/=10;     
			}
			return sum;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		int number=sc.nextInt();
		System.out.println("the sum is: "+p.sumOfPrime(number));
		
	
		
	}
}

	
		