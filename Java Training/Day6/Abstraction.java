package Day6;
abstract class Bank{    
abstract int getRateOfInterest(); 
public void loans(){
	System.out.println("loans");
}
}    
class SBI extends Bank{    
int getRateOfInterest(){
	return 7;
	}    
}    
class PNB extends Bank{    
int getRateOfInterest(){
	return 8;
	}    
}    
    
public class Abstraction {

	public static void main(String[] args) {
		Bank b;  
		b=new SBI();
		b.loans();
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		}	
	}


