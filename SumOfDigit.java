import java.util.Scanner;
@FunctionalInterface
interface Printer{
	int sum(int digit);
}

class SumOfDigit{
	
	public static void main(String... args){
		Printer p=(digit)->{
			int sum=0;
			while (digit != 0) {
                int remainder=digit%10;
				sum+=remainder;
				digit/=10;
            }
			return sum;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		int digit=sc.nextInt();
		System.out.println("the sum of the digit "+digit+" will be: "+p.sum(digit));
	
		
	}
}

	
		