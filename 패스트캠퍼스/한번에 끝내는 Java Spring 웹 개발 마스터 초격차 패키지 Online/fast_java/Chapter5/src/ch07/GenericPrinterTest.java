package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
	}

}
