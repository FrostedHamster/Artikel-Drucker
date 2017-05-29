import java.util.ArrayList;


public class TextDruckStrategie implements Druckstrategie {

	@Override
	public void artikelListeDrucken(ArrayList<Artikel> liste) {
		for(Artikel artikel: liste){
			System.out.println(artikel.getBezeichnung() + "\t" + artikel.getPreis());
		}
		
	}

}
