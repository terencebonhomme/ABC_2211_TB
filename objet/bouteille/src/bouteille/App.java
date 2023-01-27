package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille eau = new Bouteille(1.5, 1.5, false, "eau");
		
		eau.vider(0.7);
		eau.ouvrir();
		eau.viderTout();
		eau.remplirTout();
		eau.donnerNom("eau gazeuse");
		eau.vider(0.5);
		eau.remplir(0.6);
		
		System.out.println("");
		
		Bouteille soda = new Bouteille();
		
		soda.donnerNom("soda");
		soda.ouvrir();
		soda.remplir(10);
		soda.vider(0.5);
		soda.viderTout();
		soda.remplirTout();
		soda.fermer();
		
	}

}
