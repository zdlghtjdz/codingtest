package ch02;

class Outer2 {
	
	
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable getRunnable(int i) { // 클래스를 쓰레드화 할 때 필요한 run메소드를 구현할 때 사용하는 인터페이스 
		
		int num = 10;
		
		//지역 내부 클래스
//		class MyRunnable implements Runnable{
//			
//			int localNum = 1000;
//
//		@Override
//		public void run() {
//
//			//num = 200;   //에러 남. 지역변수는 상수로 바뀜
//			//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
//			System.out.println("i =" + i); 
//			System.out.println("num = " +num);  
//			System.out.println("localNum = " +localNum);
//				
//			System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
//			System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
//
//			
//		}
//			
//		}
//		return new MyRunnable();
		
		return new Runnable(){
			
			int localNum = 1000;

		@Override
		public void run() {

			System.out.println("i =" + i); 
			System.out.println("num = " +num);  
			System.out.println("localNum = " +localNum);
				
			System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
			System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

			
			}
			
		};
			
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			System.out.println("Runnable class");
		}
		
	};
	
	
	
}




public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run(); // getRunnable 함수가 끝났지만 다시 함수를 호출함.
		
		out.runnable.run();
	}

}
