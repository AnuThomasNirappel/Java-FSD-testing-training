package Day13_ass;


import java.util.*;

public class q4 {

	public static void main(String[] args) {
		Book B1=new Book("junglebook","mongli",2007,125);
		Book B2=new Book("harrypotter","harri",1952,155);
		Book B3=new Book("age of ultron","marvel",2009,185);
		ArrayList<Book>al=new ArrayList<Book>();
		al.add(B1);
		al.add(B2);
		al.add(B3);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			System.out.println(st.name+" "+st.aut_name+" "+st.year+" "+st.copies);
					
		}
	}

}
class Book{
	String name;
	String aut_name;
	int year;
	int copies;
	Book(String name,String aut_name,int year,int copies){
		this.name=name;
		this.aut_name=aut_name;
		this.year=year;
		this.copies=copies;
	}
}