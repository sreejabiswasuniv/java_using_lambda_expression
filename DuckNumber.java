import java.util.Scanner;

@FunctionalInterface
interface Printer {
    void duckOrNot(int number);
}

class DuckNumber {    
    public static void main(String... args) {
        Printer p = (number) -> {
            boolean isDuck = false;
            int originalNum = number; 

            while (number != 0) {
                int remainder = number % 10;
                if (remainder == 0) {
                    isDuck = true;
                    break;
                }
                number /= 10;
            }
            
            System.out.println(originalNum + (isDuck ?
			" is a duck number!" : 
			" is not a duck number!"));
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int number = sc.nextInt();
        p.duckOrNot(number);
        sc.close();
    }
}
