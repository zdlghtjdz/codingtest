package ch18;

public class Company {
	
	private static Company instance = new Company(); // 내부에서 인스턴스를 하나 생성.
	
	private Company() {
		
	} // 마음대로 new 할 수 없도록 private
	
	public static Company getInstance() {
		if ( instance == null)
			instance = new Company();
		
		return instance;
	}

}
