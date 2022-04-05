package Day3;

import java.util.Scanner;

public class Duck_number {
	public static void main(String[] args) {
		int k=0;
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		if(str.charAt(0)=='0') {
			System.out.println("its not duck number");
			}else {
				for(int i=1;i<l;i++) {
					char ch=str.charAt(i);
					if(ch=='0') {
						k=1;
					break;
						
						
					}
					
				}if(k==1) {
					System.out.println("its  duck number");
				}else {
					System.out.println("its not duck number");
				}
			}
		}
}