package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		//System.out.println(java);
		System.out.println(System.identityHashCode(java));
		//java의 address가 다르다.
		
		
	}

}
