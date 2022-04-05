package Day7;
import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}System.out.println("the array elements entered are");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+",");
		}
	}

}
