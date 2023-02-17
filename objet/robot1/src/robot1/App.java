package robot1;

public class App {

	public static void main(String[] args) {

		Robot bot1 = new Robot();
		Robot bot2 = new Robot("bot2", "J", 10, "E", 5);

		Manette commande = new Manette(bot1);

		System.out.println(commande.allerVers(Direction.HAUT, 2));
		System.out.println(bot1.toString());

		System.out.println(commande.allerVers(Direction.DROITE, 3));
		System.out.println(bot1.toString());

		System.out.println(commande.allerVers(Direction.BAS, 1));
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("B", 6));
		System.out.println(bot1.toString());

		System.out.println(commande.allerVers(Direction.GAUCHE, 0));
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur(3, 4));
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("B", 6));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColis());
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("B", 6));
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("C", 3));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisVers(Direction.DROITE, 4));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisVers(Direction.HAUT, 3));
		System.out.println(bot1.toString());

		System.out.println(commande.allerVers(Direction.HAUT, 4));
		System.out.println(commande.ramenerColis());

		System.out.println(commande.allerVers(Direction.HAUT, 3));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColis());
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("B", 6));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisVers(Direction.BAS, 2));
		System.out.println(bot1.toString());

		System.out.println(commande.allerSur("B", 6));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisVers(Direction.GAUCHE, 0));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisSur(3, 3));
		System.out.println(bot1.toString());

		System.out.println(commande.ramenerColisSur("D", 3));
		System.out.println(bot1.toString());
	}
}
