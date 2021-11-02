package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int dan = 2;
		
		/*
		for( ; dan <= 9; dan ++) {
			
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + " = " + dan*count);
			}
			System.out.println();
		}
		*/
		
		int count2 = 1;
		int dan2 = 2;
		
		while(true) {
			if (count2 > 9) {
				dan2 += 1;
				count2 = 1;
				System.out.println();
			}
			if (dan2 > 9) {
				break;
			}
			
			System.out.println(dan2 + "X" + count2 + " = " + dan2*count2);
			count2++;
		}
			
	}

}
