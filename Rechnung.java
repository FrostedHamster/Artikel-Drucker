import java.util.ArrayList;


public class Rechnung {
	private Druckstrategie druckStrategie;
	private ArrayList<Artikel>artikelListe;
	public Rechnung(){
		artikelListe = new ArrayList<Artikel>();
	}
	
	public void setDruckStrategie(Druckstrategie druckStrategie) {
		this.druckStrategie = druckStrategie;
	}

	public void add(Artikel artikel){
		artikelListe.add(artikel);
	}
	public void drucken(){
		druckStrategie.artikelListeDrucken(artikelListe);
	}
}

