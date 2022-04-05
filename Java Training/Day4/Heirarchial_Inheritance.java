package Day4;
class animal4{
	void eat() {
		System.out.println("Animal is eating");
	}
}class dog2 extends animal{
	void bark() {
		System.out.println("dog is barking");
	}
}class cat extends animal{
	void meowing() {
		System.out.println("cat is meowing");
	}
}


public class Heirarchial_Inheritance {

	public static void main(String[] args) {
		cat obj=new cat();
		//obj.bark();
		obj.eat();
		obj.meowing();
		
	}

}
