package Day11_Arraylist;

import java.util.*;

public class Iter_for {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");
		  for(String fruit:list) {
		  System.out.println(fruit);
	}
	
}
}
