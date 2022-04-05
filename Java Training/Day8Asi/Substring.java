package Day8Asi;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String a=sc.nextLine();
		System.out.println("enter the second string");
		String b=sc.nextLine();
		boolean result=false;
		result=a.contains(b);
		System.out.println(result);
		
	}

}
