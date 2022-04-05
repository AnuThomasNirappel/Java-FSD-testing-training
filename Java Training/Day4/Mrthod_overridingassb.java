package Day4;

public class Mrthod_overridingassb {
	static void add(int a,double b) {
		System.out.println(a+b);	
		}
		static void add(int a,int b,double c) {
			System.out.println(a+b+c);	
			}
		static void mul(int a,double b,int c) {
				System.out.println(a+b+c);	
				}

	public static void main(String[] args) {
		add(10,10.2);
		add(7,5,4.4);
		mul(5,5.5,3);
		
	}

}
