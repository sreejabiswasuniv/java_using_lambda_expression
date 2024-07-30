import java.util.Scanner;
@FunctionalInterface
interface Printer{
	void isleapyear(int year);
}

class LeapYear{
	
	public static void main(String... args){
		
		Printer p=(year)->{
			if(year<0)
				throw new IllegalArgumentException(" Invalid year "+year);
			else
				System.out.println(year+(((year%4==0 && year%100!=0)||(year%400==0))?
			" is leap year!":
			" is not a leap year!"));
			
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year: ");
		int year=sc.nextInt();
		p.isleapyear(year);
		

		
	}
}

	
		