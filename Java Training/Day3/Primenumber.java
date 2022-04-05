package Day3;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				
				System.out.println("it is not prime number");
				prime=false;
				break;
			}
			
		}System.out.println("it is a prime number");
	}

}
