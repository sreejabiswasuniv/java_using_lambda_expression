import java.util.Scanner;
@FunctionalInterface
interface Printer{
	int digits(int digit);
}

class DigitExtractor{
	
	public static void main(String... args){
		Printer p=(digit)->{
			
			while (digit != 0) {
                int remainder=digit%10;
				System.out.print(remainder+ " ");
				digit/=10;
            }
			return digit;
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		int digit=sc.nextInt();
		p.digits(digit);
		
	
		
	}
}

	
		