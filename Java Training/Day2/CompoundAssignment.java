package Day2;

import java.util.Scanner;

public class CompoundAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wo number");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		a+=b;
		System.out.println("Adittion of two number =" +a);
		a-=b;
		System.out.println("Subtration of two number =" +a);
		a*=b;
		System.out.println("multiplication of two number =" +a);
		a/=b;
		System.out.println("Division of two number =" +a);
		a%=b;
		System.out.println("Remainder of two number =" +a);
		int c=1;
	c++;
	System.out.println("c"+c);
	c--;
	System.out.println("c"+c);
	



	}

}
