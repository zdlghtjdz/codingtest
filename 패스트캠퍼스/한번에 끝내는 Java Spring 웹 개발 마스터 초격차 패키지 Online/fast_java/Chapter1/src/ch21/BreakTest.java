package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		for(num = 1; ; num++) {
			sum += num;
			if (sum >= 100) //�׷��� break�� ���
				break;
		}
		
		System.out.println(sum);
		System.out.println(num); // ����üũ �ϰ� ���߿� ++ ������ ������.
		
	}

}
