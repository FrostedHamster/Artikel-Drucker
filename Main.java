
public class Main {

	public static void main(String[] args) {
		Rechnung rechnung = new Rechnung();
		rechnung.setDruckStrategie(new HtmlDruckstrategie());
		rechnung.add(new Artikel("USB-Stick", 9.99f));
		rechnung.add(new Artikel("Mauspad", 2.23f));
		rechnung.drucken();
	
	}

}
