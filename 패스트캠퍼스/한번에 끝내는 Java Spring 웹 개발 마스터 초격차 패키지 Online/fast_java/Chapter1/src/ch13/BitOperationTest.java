package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1); // 값이 바뀌지 않는다. 값을 바꾸기 위해서는 <<= 대입연산자를 사용하자.
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
