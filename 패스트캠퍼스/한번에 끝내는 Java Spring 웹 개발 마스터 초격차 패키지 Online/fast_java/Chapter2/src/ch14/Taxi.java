package ch14;

public class Taxi {
	
	String taxiName;
	int passengerCount;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += 10000;
		passengerCount += 1;
	}
	
	public void showTaxiInfo () {
		System.out.println(taxiName + " 회사 택시의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}

}
