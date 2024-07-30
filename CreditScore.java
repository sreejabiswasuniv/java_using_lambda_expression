import java.util.Scanner;
@FunctionalInterface
interface Printer{
	void creditscore(int cscore);
}

class CreditScore{
	
	public static void main(String... args){
		
		Printer p=(cscore)->{
			if((cscore<0) || (cscore<400 || cscore>850)){
				throw new IllegalArgumentException(" Invalid credit score "+cscore);
			}
			else{
				
				System.out.println(cscore+
				((cscore>=400 && cscore<600)? " is Silver!":
				(cscore>=600 && cscore<800)? " is Gold!":
				" is Platinum!"));
						
			}
				
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your credit score: ");
		int cscore=sc.nextInt();
		p.creditscore(cscore);
		
		

		
	}
}

	
		