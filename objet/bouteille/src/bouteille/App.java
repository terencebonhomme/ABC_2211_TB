package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille eau = new Bouteille();
		
		System.out.println("eau.ouvert : " + eau.ouvert);
		eau.ouvrir();
		System.out.println("eau.ouvert : " + eau.ouvert);
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);
		
		System.out.println("eau.vider()");
		eau.vider();
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);
		
		System.out.println("eau.remplir()");
		eau.remplir();
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);
		
		eau.fermer();
		System.out.println("eau.ouvert : " + eau.ouvert);
		
	}

}
