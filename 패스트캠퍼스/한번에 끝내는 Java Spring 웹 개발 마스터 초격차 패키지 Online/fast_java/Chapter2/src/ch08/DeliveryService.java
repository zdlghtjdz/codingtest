package ch08;

public class DeliveryService {
	
	public String deliveryAcceptNumber;
	public String deliveryPhoneNumber;
	public String deliveryAddress;
	public String deliveryDate;
	public String deliveryTime;
	public String deliveryPrice;
	public String deliveryMenuNumber;
	
	public DeliveryService () {
		
	}
	
	public DeliveryService (String deliveryAcceptNumber, String deliveryPhoneNumber,
			String deliveryAddress, String deliveryDate, String deliveryTime, String deliveryPrice,
			String deliveryMenuNumber) {
		
		this.deliveryAcceptNumber = deliveryAcceptNumber;
		this.deliveryAddress = deliveryAddress;
		this.deliveryDate = deliveryDate;
		this.deliveryMenuNumber = deliveryMenuNumber;
		this.deliveryPhoneNumber = deliveryPhoneNumber;
		this.deliveryPrice = deliveryPrice;
		this.deliveryTime = deliveryTime;
		
	}
	
	public void showDeliveryInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + deliveryAcceptNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + deliveryPhoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + deliveryAddress);
		System.out.println("�ֹ� ��¥ : " + deliveryDate);
		System.out.println("�ֹ� �ð� : " + deliveryTime);
		System.out.println("�ֹ� ���� : " + deliveryPrice);
		System.out.println("�޴� ��ȣ  : " + deliveryMenuNumber);
	}

}
