package Day4;

public class Method_overloading {
	static void add(int a,int b) {
	System.out.println(a+b);	
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);	
		}

	public static void main(String[] args) {
		add(11,12);
		add(11,22,33);
		
	}

}
