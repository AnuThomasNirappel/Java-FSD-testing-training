package Day7;

import java.util.Scanner;

public class Max_in_arr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int []arr=new int [size];
		System.out.println("Enter the elememnts of array");
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }System.out.println("max in array");
		 int max= arr[0];
		 for(int i=0;i<size;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
			 }
		 }System.out.println(max);
		
	}

}
