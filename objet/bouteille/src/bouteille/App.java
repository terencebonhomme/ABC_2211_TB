package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille eau = new Bouteille();
		
		// ouvrir
		System.out.println("eau.ouvert : " + eau.ouvert);
		System.out.println("eau.ouvrir()");
		eau.ouvrir();
		System.out.println("eau.ouvert : " + eau.ouvert);
		
		// vider
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);		
		System.out.println("eau.vider()");
		eau.vider();
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);
		
		// remplir
		System.out.println("eau.remplir(50.5)");
		eau.remplir(50.5);
		System.out.println("eau.volumeCourant : " + eau.volumeCourant);
		
		// fermer
		System.out.println("eau.fermer()");
		eau.fermer();
		System.out.println("eau.ouvert : " + eau.ouvert);
		
	}

}
