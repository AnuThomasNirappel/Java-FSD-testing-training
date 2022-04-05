package Day4;
class animal2{
	void eat() {
		System.out.println("Animal is eating");
	}
}class dog3 extends animal{
	void bark() {
		System.out.println("dog is barking");
	}
}class puppy extends dog{
	void weeping() {
		System.out.println("puppy is weeping");
	}
}


public class Multilevel_inheritance {

	public static void main(String[] args) {
		puppy ob=new puppy();
		ob.bark();
		ob.eat();
		ob.weeping();
		
	}

}
