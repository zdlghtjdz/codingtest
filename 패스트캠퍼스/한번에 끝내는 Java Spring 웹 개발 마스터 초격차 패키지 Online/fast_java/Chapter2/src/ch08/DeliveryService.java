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
		System.out.println("주문 접수 번호 : " + deliveryAcceptNumber);
		System.out.println("주문 핸드폰 번호 : " + deliveryPhoneNumber);
		System.out.println("주문 집 주소 : " + deliveryAddress);
		System.out.println("주문 날짜 : " + deliveryDate);
		System.out.println("주문 시간 : " + deliveryTime);
		System.out.println("주문 가격 : " + deliveryPrice);
		System.out.println("메뉴 번호  : " + deliveryMenuNumber);
	}

}
