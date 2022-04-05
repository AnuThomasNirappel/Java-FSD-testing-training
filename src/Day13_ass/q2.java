package Day13_ass;

import java.util.ArrayList;

public class q2 {

	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(8);
	 double sum = 0;
	 double avg;

     for (int i=0;i<al.size();i++){
         sum += al.get(i);
     }

     System.out.println(sum);
     avg=sum/al.size();
     System.out.println(avg);
	}

}
