import java.util.Scanner;
@FunctionalInterface
interface Printer{
	int reverse(int digit);
}

class ReverseOfNumber{
	
	public static void main(String... args){
		Printer p=(digit)->{
			int reversed=0;
			while (digit != 0) {
                int remainder = digit % 10;
                reversed = reversed * 10 + remainder;
                digit /= 10;
            }
			return reversed;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		int digit=sc.nextInt();
		System.out.println("the reverse will be: "+p.reverse(digit));
	
		
	}
}

	
		