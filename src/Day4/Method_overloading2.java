package Day4;

public class Method_overloading2 {
	static void add(int a,double b) {
		System.out.println(a+b);	
		}
		static void add(int a,int b,int c) {
			System.out.println(a+b+c);	
			}

	public static void main(String[] args) {
		add(15,7.6);
		add(22,85,99);
		
	}

}
