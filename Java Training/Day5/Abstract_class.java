package Day5;
abstract class bike{
	bike()//constructor
	{
		System.out.println("Bike class is invoked");
	}void run(){
		System.out.println("bike is running");
	}
	abstract void display();
}
class suzuki extends bike{
	void run() {
		System.out.println("suzuki is running");
	}void display(){
	System.out.println("suzuki is top tier bike");	
	}
}
public class Abstract_class {

	public static void main(String[] args) {
		bike ob=new suzuki();
		ob.run();
		ob.display();
	}

}
