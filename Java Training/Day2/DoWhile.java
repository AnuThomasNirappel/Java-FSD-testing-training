package Day2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("printing the number from 1 to 10");
		int i=1;
		do {
			System.out.println(i+",");
			i++;
			
		}while(i<=10);
		System.out.println();
		i=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do {
			System.out.println(i+",");
			i++;
		}while(i<=n);
		System.out.println();
		System.out.println("printing the number from 10 to 1");
		 i=10;
		do {
			System.out.println(i+",");
			i--;
			
		}while(i>=1);
		System.out.println();
		i=n;
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		do {
			System.out.println(i+",");
			i--;
		}while(i>=1);
		System.out.println();
		
	}

}
