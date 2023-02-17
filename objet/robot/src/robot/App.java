package robot;

enum Direction {
	HAUT, DROITE, BAS, GAUCHE
}

public class App {

	/**
	 * 	objectif : ramasser toutes les piles avec un robot sans qu'il soit en manque d'energie, modifier le code selon les resultats
		
		/etapes a suivre :
		- allumer le robot 
		- cartographier la carte
		- tourner pour changer de direction puis avancer
		- ramasser toutes les piles
		- consommer les piles pour avoir suffisamment d'energie
		- veiller
		- commenter la partie pour verifier si c'est fini
		/conseils : 
		- utiliser le constructeur par defaut
		- afficher la carte pour voir où en est le robot
		- utiliser toString pour voir la position du robot et d'autres variables
		
	 * @param args
	 */
	public static void main(String[] args) {
		
				// contenu de main à supprimer
		
				// constructeur pour le test d'une victoire
				Robot test = new Robot();
				
				// constructeur pour le test des limites de la carte
				//Robot test = new Robot(10, 10, Direction.BAS, 0, 1, 0.4, 3);
				
				test.allumer();

				test.cartographier();			
				
				// test victoire
				
				test.avancer(2);
				test.tourner(Direction.DROITE);
				test.avancer(2);
				test.ramasser();
				
				test.consommerBatterie();
				
				test.tourner(Direction.GAUCHE);
				test.avancer(1);
				test.tourner(Direction.BAS);
				test.avancer(4);
				test.ramasser();
				
				test.consommerBatterie();
				
				test.tourner(Direction.DROITE);
				test.avancer(3);
				test.tourner(Direction.HAUT);
				test.avancer(3);
				test.ramasser();
				
				test.consommerBatterie();
				
				test.tourner(Direction.DROITE);
				test.avancer(3);
				test.tourner(Direction.HAUT);
				test.avancer(3);
				test.ramasser();
				
				test.consommerBatterie();

				test.tourner(Direction.DROITE);
				test.avancer(3);
				test.tourner(Direction.BAS);
				test.avancer(2);
				test.ramasser();
				
				test.consommerBatterie();
				
				test.tourner(Direction.DROITE);
				test.avancer(2);
				test.tourner(Direction.BAS);
				test.avancer(3);
				test.ramasser();		
				
				test.afficherCarte();

				System.out.println(test.toString());	
				
				test.veiller();
				
				test.commenterCompletion();
	}
}
