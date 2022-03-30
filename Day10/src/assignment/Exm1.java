package assignment;
public class Exm1 {
public static void main(String[] args) {
	String str="anu";
	try
	{
	int a=Integer.valueOf(str);
	System.out.println(a);
	System.out.println("String NumberFormatException");
	}
		catch(NumberFormatException e)
	{
		System.out.println("String" +str+ "cannot be converted to string");
	}
}
}


		
	


