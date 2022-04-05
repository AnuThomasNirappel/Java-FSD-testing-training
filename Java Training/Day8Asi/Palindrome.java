package Day8Asi;
import java.util.Scanner;


public class Palindrome {
	static boolean isPalindrome(String str1)
	{
		char[] arr1=str1.toCharArray();
		char[] rev=new char[arr1.length];
		for(int i=arr1.length-1,j=0;i>=0;i--)
		{
			rev[j]=arr1[i];
			j++;
		}
		String newStr=new String(rev);
		return str1.equalsIgnoreCase(newStr);
	}	


	public static void main(String[] args) {
		 System.out.println("Enter a String");
		 Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
        String strArray[] = str.split(" ");

        System.out.println("String : " + str);
        System.out.println("String array : [ ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ", ");
        }
        System.out.print("]"+"\n"); 
        
       for(String s:strArray)
        {
        	if(isPalindrome(s))
        	{
        		 System.out.println(s+" is a Palindrome");     }   	
        
        else
        {
        	 System.out.println(s+" is not a Palindrome");

	}

        }
	}
}
