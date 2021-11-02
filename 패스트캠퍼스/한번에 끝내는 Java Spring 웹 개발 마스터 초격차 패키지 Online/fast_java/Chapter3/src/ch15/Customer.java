package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("customer buy");
	}

	//1. Sell의 인터페이스의 디폴트 메서드를 사용해라
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Sell.super.order();
//	}
	//2. Buy의 인터페이스의 디폴트 메서드를 사용해라
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Buy.super.order();
//	}
	//3. 아예 새로 재정의 해라.
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}

	
	

}
