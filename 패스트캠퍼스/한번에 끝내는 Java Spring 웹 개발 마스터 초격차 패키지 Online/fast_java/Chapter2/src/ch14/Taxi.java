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
		System.out.println(taxiName + " ȸ�� �ý��� �°� ���� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}

}
