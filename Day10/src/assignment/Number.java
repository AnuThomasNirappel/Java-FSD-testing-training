package assignment;
public class Number {
public static void main(String[] args) {
	String str="anu";
	try
	{
	int a=Integer.parseInt(str);
	System.out.println(a);
	System.out.println("String NumberFormatException");
	}
		catch(NumberFormatException e)
	{
		System.out.println("String" +str+ "cannot be converted to string");
	}
}
}
		

	

