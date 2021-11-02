package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		//Computer computer = new Computer(); // 추상클래스는 생성할 수 없다!
		desktop.turnOff();
		desktop.display();
		
	}

}
