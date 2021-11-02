package ch05;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//기존 방식
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		//내부적으로 익명 클래스가 생성됨
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				
				System.out.println(s1 + "...." + s2);
			}			
		};
		
		concat2.makeString(s1, s2);
	}

}
