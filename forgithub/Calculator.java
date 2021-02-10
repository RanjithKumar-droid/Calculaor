package forgithub;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		Scanner sym = new Scanner(System.in);
		System.out.println("Enter a number");
		double a = s.nextDouble();
		System.out.println("Enter a number");
		double b = s.nextDouble();
		System.out.println("Select your operation");
		char operator = sym.next().charAt(0);
		Calculations ref = new Calculations();
		switch(operator){
				
			case '+' : ref.Add(a,b); break;
			case '-' : ref.Sub(a,b); break;
			case '*' : ref.Mul(a,b); break;
		}
		
	}
}
