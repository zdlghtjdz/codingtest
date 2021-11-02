package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		for(num = 1; ; num++) {
			sum += num;
			if (sum >= 100) //그래서 break문 사용
				break;
		}
		
		System.out.println(sum);
		System.out.println(num); // 조건체크 하고 나중에 ++ 때문에 더해짐.
		
	}

}
