package Day9_Static_super_final;

public class final_exp1 {
	int a=5;
	void test()
	{
		a=350;
		System.out.println("a value after changing="+a);
}

	public static void main(String[] args) {

		final_exp1 a=new final_exp1();
			System.out.println("a ="+a);
			a.test();
	}

}
