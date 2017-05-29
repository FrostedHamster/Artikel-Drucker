import java.util.ArrayList;


public class HtmlDruckstrategie implements Druckstrategie{

	@Override
	public void artikelListeDrucken(ArrayList<Artikel> liste) {
		System.out.println("<table>");
		for(Artikel artikel: liste){
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>"+artikel.getBezeichnung()+"</td>");
			System.out.println("\t\t<td>"+artikel.getPreis()+"</td>");
			System.out.println("\t<tr>");
		}
		System.out.println("</table>");

	}

}
