package Day4;
class bike{
	void run() {
		System.out.println("Bike is running");
	}
}class Honda extends bike{
	void run(){
		System.out.println("Honda is running");
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		bike obj=new Honda();
		obj.run();
		
	}

}
