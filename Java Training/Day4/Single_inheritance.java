package Day4;
class animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}class dog extends animal{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		dog obj=new dog();
		obj.eat();
		obj.bark();
	}

}
