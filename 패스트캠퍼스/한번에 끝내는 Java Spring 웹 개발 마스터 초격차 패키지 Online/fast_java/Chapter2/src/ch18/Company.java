package ch18;

public class Company {
	
	private static Company instance = new Company(); // ���ο��� �ν��Ͻ��� �ϳ� ����.
	
	private Company() {
		
	} // ������� new �� �� ������ private
	
	public static Company getInstance() {
		if ( instance == null)
			instance = new Company();
		
		return instance;
	}

}
