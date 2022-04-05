package Day3;

import java.util.Scanner;

public class Arithematic_operation {

	public static void main(String[] args) {
		char operator;
		int num1=0;
		int num2=0;
		double answer=0.0;
Scanner scan= new Scanner(System.in);
System.out.println("Enter your first number");
 num1=scan.nextInt();
System.out.println("Enter your second number");
 num2=scan.nextInt();
System.out.println("What operator");
operator=scan.next().charAt(0);
switch(operator) {
case'+':answer=num1+num2;
break;
case'-':answer=num1-num2;
break;
case'*':answer=num1*num2;
break;
case'/':answer=num1/num2;
break;
case'%':answer=num1%num2;
break;
}
System.out.println(num1+" "+operator+" "+num2+" ="+answer);
	}
	}


