package ch01;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)" );
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수");
		}
		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)" );
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수");
		}
		
		static void sTest() {
			// 정적 내부 클래스에서 외부 클래스의 인스턴스 변수는 사용할 수 없다.
			//System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)" );
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수");
		}
	}
	
	
}

public class innerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		//InClass가 private가 아니라면, 이렇게도 할 수는 있다.
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		//외부에서 바로 내부 정적 클래스를 생성할 수 있다.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		// 내부 정적 메소드는 바로 가져다 사용할 수 있다.
		OutClass.InStaticClass.sTest();
		
	}

}
