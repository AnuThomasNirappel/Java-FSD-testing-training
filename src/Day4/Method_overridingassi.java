package Day4;


public class Method_overridingassi {
	static void add(int a,int b) {
		System.out.println(a+b);	
		}
		static void add(int a,int b,int c) {
			System.out.println(a+b+c);	
			}
		static void sub( int x,int y,int z) {
			System.out.println(x-y-z);	
			}
	public static void main(String[] args) {
		add(11,12);
		add(11,22,33);
		sub(100,25,3);
		
	}

}
