package assignment;
public class FstQst {
public static void main(String[] args) {
	 String str = "Welcome to ust.";
     try {
        // StringIndexOutOfBoundsException will be thrown because str only has a length of 14  
        str.charAt(28);
        System.out.println("String Index is valid");
     } 
     catch 
     (StringIndexOutOfBoundsException e) {
        System.out.println("String Index is out of bounds");
     }      
  }
}
	
	


