package Day8Asi;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println("enter a charater that present in the string");
		char b=(char) sc.next().charAt(0);
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b)
				count++;
		}
		System.out.println(count);
	}

}
