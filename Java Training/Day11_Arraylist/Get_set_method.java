package Day11_Arraylist;

import java.util.ArrayList;

public class Get_set_method {

	public static void main(String[] args) {
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  System.out.println("get the element"+" "+al.get(1));
		  al.set(1, "Dates");
		  for(String fruit:al)
			  System.out.println(fruit);
	}

}
