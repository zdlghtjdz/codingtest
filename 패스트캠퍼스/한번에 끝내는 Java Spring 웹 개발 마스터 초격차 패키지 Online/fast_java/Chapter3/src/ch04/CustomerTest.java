package ch04;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		price = customerKim.calcPrice(1000);
		System.out.println(price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		System.out.println(vc.calcPrice(1000)); // VIPCustomer의 메소드 호출
		
		// 인스턴스는 VIPCustomer의 속성을 모두 가지고 있지만,
		// 변수 형이 Customer이기 때문에 VIPCustoemr의 메소드는 사용할 수 없다.
	}

}
