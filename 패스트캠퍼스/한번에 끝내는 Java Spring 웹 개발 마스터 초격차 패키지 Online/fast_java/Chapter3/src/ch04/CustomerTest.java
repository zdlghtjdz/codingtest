package ch04;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		price = customerKim.calcPrice(1000);
		System.out.println(price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		System.out.println(vc.calcPrice(1000)); // VIPCustomer�� �޼ҵ� ȣ��
		
		// �ν��Ͻ��� VIPCustomer�� �Ӽ��� ��� ������ ������,
		// ���� ���� Customer�̱� ������ VIPCustoemr�� �޼ҵ�� ����� �� ����.
	}

}
