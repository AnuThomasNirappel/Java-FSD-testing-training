package Day4;
class shape{
	void draw(){
		System.out.println("any shape can be drawn");
	}
}class circle extends shape{
	void draw() {
		System.out.println("circle shape can be drawn");
	}
}class rectangle extends shape{
	void draw() {
		System.out.println("rectangle shape can be drawn");
	}
}class triangle extends shape{
	void draw() {
		System.out.println("triangle shape can be drawn");
	}
}
public class Method_overriding2 {

	public static void main(String[] args) {
		shape s=null;
		s=new shape();
		s.draw();
		s=new rectangle();
		s.draw();
		s=new triangle();
		s.draw();
		s=new circle();
		s.draw();
		
	}

}
