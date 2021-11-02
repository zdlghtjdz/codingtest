package ch07;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();//object에서 다운캐스팅을 명시적으로 해줘야됨.
		// 매우 귀찮음
		// -> 제네릭 프로그래밍
	}

}
