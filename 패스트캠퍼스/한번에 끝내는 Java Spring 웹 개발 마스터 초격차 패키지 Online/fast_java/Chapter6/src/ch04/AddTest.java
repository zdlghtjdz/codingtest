package ch04;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x,y)-> x + y; 
		//Add addL = (x,y)-> {return x + y}; 
		System.out.println(addL.add(2,3));
	}	

}
