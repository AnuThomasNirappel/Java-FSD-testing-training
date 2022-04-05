package Day12_arraylist;

import java.util.*;

public class User_defined_class {

	public static void main(String[] args) {
		//creating user defined class object
		Student s1=new Student(101,"anjali",55);
		Student s2=new Student(505,"appu",44);
		Student s3=new Student(44,"jaffer",77);
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);//adding student class object
		al.add(s2);
		al.add(s3);
		Iterator itr= al.iterator();
		//traversing the element of arraylist
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollname+" "+st.name+" "+st.age);
		}
		
	}

}
class Student{
	int rollname;
	String name;
	int age;
	Student(int rollname,String name,int age){
		this.rollname=rollname;
		this.age=age;
		this.name=name;
	}
}