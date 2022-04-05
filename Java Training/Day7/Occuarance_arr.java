package Day7;

import java.util.Scanner;

public class Occuarance_arr {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println("enter the one element in the array");
		int n=sc.nextInt();
		int index=0;
		for(int i=0;i<size;i++) {
			if(n==arr[i]) {
				index=i;
			}
		}System.out.println("index of entered element"+index);
	}

}
