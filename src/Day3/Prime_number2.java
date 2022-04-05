package Day3;

import java.util.Scanner;

public class Prime_number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		boolean prime=true;
		if(i>1) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime= false;
				}
			}
			
		}else {
			prime=false;
		}if(prime) {
			System.out.println(i+",");
		}
		}
	}
}

	