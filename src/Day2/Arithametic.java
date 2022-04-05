package Day2;

import java.util.Scanner;

public class Arithametic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter wo number");
		double c;
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		c=a+b;
		System.out.println("Adittion of two number =" +c);
		c=a-b;
		System.out.println("Subtration of two number =" +c);
		c=a*b;
		System.out.println("multiplication of two number =" +c);
		c=a/b;
		System.out.println("Division of two number =" +c);
		c=a%b;
		System.out.println("Remainder of two number =" +c);
	}

}
