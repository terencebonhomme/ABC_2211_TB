package ascenseur;

public class App {

	public static void main(String[] args) {

		Ascenseur ascenseur = new Ascenseur();
		Ascenseur ascenseur2 = new Ascenseur(9, 9, true, true, true, 0, 6);

		System.out.println(ascenseur2.toString());
		// System.out.println(ascenseur.monter(5));
		
		System.out.println(ascenseur.monter(10, 2));
		System.out.println(ascenseur2.toString());

		// System.out.println(ascenseur2.fermer());
		System.out.println(ascenseur2.descendre(8, 3));
		System.out.println(ascenseur2.toString());
		
		System.out.println(ascenseur2.descendre(6, 4));
		System.out.println(ascenseur2.toString());
		
		System.out.println(ascenseur.monter(7, 1));
		System.out.println(ascenseur2.toString());
		
		System.out.println(ascenseur2.descendre(3, 3));
		System.out.println(ascenseur2.toString());
		
		System.out.println(ascenseur2.descendre(3, 3));
		System.out.println(ascenseur2.toString());
		
		System.out.println(ascenseur2.descendre(0, 1));
		System.out.println(ascenseur2.toString());
	}
}
