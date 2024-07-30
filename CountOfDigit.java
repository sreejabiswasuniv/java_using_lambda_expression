import java.util.Scanner;
@FunctionalInterface
interface Printer{
	int count(int number);
}

class CountOfDigit{
	
	public static void main(String... args){
		Printer p=(number)->{
			int count=0;
			while(number!=0){
				number/=10;
				count++;
				
			}
			return count;
			
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		int number=sc.nextInt();
		System.out.println("the count is: "+p.count(number));
		
	
		
	}
}

	
		