package Day3;

public class Ternary_operator {

	public static void main(String[] args) {
		int a=10,b=5,c=35;
		int result=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(result);
		//b
		 result=(a<b)?(a<c?a:c):(b<c?b:c);
		 System.out.println(result);
	}

}
