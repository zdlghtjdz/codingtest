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

	//1. Sell�� �������̽��� ����Ʈ �޼��带 ����ض�
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Sell.super.order();
//	}
	//2. Buy�� �������̽��� ����Ʈ �޼��带 ����ض�
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Buy.super.order();
//	}
	//3. �ƿ� ���� ������ �ض�.
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}

	
	

}
