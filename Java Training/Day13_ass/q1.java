package Day13_ass;

import java.util.ArrayList;
import java.util.Collections;

public class q1 {

	public static void main(String[] args) {
		ArrayList<Double>al=new ArrayList<Double>();
		al.add(12.2);
		al.add(15.5);
		al.add(7.5);
		al.add(17.5);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
