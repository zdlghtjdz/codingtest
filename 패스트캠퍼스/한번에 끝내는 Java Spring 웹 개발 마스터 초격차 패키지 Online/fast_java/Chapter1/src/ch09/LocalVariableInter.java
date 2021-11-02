package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10; // 자바 10부터 돌아감
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		//str = 3;
	}

}
