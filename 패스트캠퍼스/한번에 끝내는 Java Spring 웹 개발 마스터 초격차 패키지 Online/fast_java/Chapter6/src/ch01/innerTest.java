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
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)" );
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����");
		}
		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("InClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)" );
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����");
		}
		
		static void sTest() {
			// ���� ���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			//System.out.println("InClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)" );
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ ����ƽ ����");
		}
	}
	
	
}

public class innerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		//InClass�� private�� �ƴ϶��, �̷��Ե� �� ���� �ִ�.
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		//�ܺο��� �ٷ� ���� ���� Ŭ������ ������ �� �ִ�.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		// ���� ���� �޼ҵ�� �ٷ� ������ ����� �� �ִ�.
		OutClass.InStaticClass.sTest();
		
	}

}
