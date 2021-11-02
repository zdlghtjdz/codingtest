package ch08;

public class DeliveryServiceTest {

	public static void main(String[] args) {
		
		DeliveryService first = new DeliveryService(
				"202011020003",
				"01023450001",
				"서울시 강남구 역삼동 111-3333",
				"20201102",
				"130258",
				"35000",
				"0003"
				);
		
		first.showDeliveryInfo();
		
	}

}
