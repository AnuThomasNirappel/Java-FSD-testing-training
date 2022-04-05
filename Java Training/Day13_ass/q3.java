package Day13_ass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
	ArrayList<String>f_name=new ArrayList<String>();
	ArrayList<String>l_name=new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of student");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("enter the first_name of student");
		f_name.add(sc.next());
		System.out.println("enter the last_name of student");
		l_name.add(sc.next());
		
	}for(int i=0;i<n;i++) {
		System.out.println("full_name of the student"+f_name.get(i)+l_name.get(i));
	}
	}
}

