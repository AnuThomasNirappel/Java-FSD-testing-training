package Day5;


public class Constructor{
	int modelyear;
	String modelname;
	public Constructor(int year,String name) {
		modelyear=year;
		modelname=name;
	}
	


	public static void main(String[] args) {
		Constructor mycar=new Constructor(1969,"mustag");
		System.out.println(mycar.modelname+" "+mycar.modelyear);
	}

}
