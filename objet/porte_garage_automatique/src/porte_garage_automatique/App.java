package porte_garage_automatique;

import batterie.Batterie;
import commande.Commande;
import commande.CommandeAvecBatterie;
import commande.CommandeSansBatterie;
import porte.PorteGarageAutomatique;
import porte.PorteGarageManuelle;

public class App {

	public static void main(String[] args) {

		// porte automatique avec un constructeur par défaut

		// PorteGarageAutomatique laToulousaine = new PorteGarageAutomatique();

		// System.out.println(laToulousaine.toString());

		// batteries

		Batterie batterie_1 = new Batterie(40, true);
		Batterie batterie_2 = new Batterie(0, true);
		// Batterie batterie_3 = new Batterie(0, false);
		Batterie batterie_4 = new Batterie(60, false);
		// Batterie batterie_5 = new Batterie();

		// commandes

		/*
		 * CommandeAvecBatterie commande_supplementaire_1 = new
		 * CommandeAvecBatterie("locale", true, laToulousaine, batterie_1);
		 * CommandeAvecBatterie commande_supplementaire_2 = new
		 * CommandeAvecBatterie("distante", true, laToulousaine, batterie_2);
		 * CommandeSansBatterie commande_supplementaire_3 = new
		 * CommandeSansBatterie("distante", true, laToulousaine); CommandeAvecBatterie
		 * commande_supplementaire_4 = new CommandeAvecBatterie("distante", true,
		 * laToulousaine, null);
		 * 
		 * laToulousaine.ajouterCommande(commande_supplementaire_1);
		 * laToulousaine.ajouterCommande(commande_supplementaire_2);
		 * laToulousaine.ajouterCommande(commande_supplementaire_3);
		 * 
		 * laToulousaine.ajouterCommande(commande_supplementaire_4);
		 * System.out.println(laToulousaine.getCommandes()[3].ouvrir(2));
		 * System.out.println(laToulousaine.toString());
		 */

		// System.out.println(laToulousaine.toString());

		// System.out.println(laToulousaine.getCommandes()[0].ouvrir());
		// System.out.println(laToulousaine.toString());

		// System.out.println(laToulousaine.getCommandes()[2].ouvrir(2));
		// System.out.println(laToulousaine.toString());

		// System.out.println(laToulousaine.getCommandes()[1].fermer());
		// System.out.println(laToulousaine.toString());

		// System.out.println(laToulousaine.getCommandes()[2].fermer(1));
		// System.out.println(laToulousaine.toString());

		// porte automatique avec un constructeur avec des variables

		PorteGarageAutomatique franceFermeture = new PorteGarageAutomatique("France Fermeture", "moteur a cremaillere",
				"coulissante", "PVC", 30.5, 5, false);
		Commande[] liste_commandes = new Commande[] {
				new CommandeAvecBatterie("locale", true, franceFermeture, batterie_4),
				new CommandeSansBatterie("distante", true, franceFermeture) };
		franceFermeture.setCommandes(liste_commandes);

		CommandeAvecBatterie commande_supplementaire_1 = new CommandeAvecBatterie("locale", true, franceFermeture,
				batterie_1);
		CommandeAvecBatterie commande_supplementaire_2 = new CommandeAvecBatterie("distante", true, franceFermeture,
				batterie_2);
		CommandeSansBatterie commande_supplementaire_3 = new CommandeSansBatterie("distante", true, franceFermeture);
		CommandeAvecBatterie commande_supplementaire_4 = new CommandeAvecBatterie("distante", true, franceFermeture,
				null);

		franceFermeture.ajouterCommande(commande_supplementaire_1);
		franceFermeture.ajouterCommande(commande_supplementaire_2);
		franceFermeture.ajouterCommande(commande_supplementaire_3);
		franceFermeture.ajouterCommande(commande_supplementaire_4);
		
		// System.out.println(franceFermeture.getCommandes()[3].ouvrir(2));
		System.out.println(franceFermeture.toString());

		// System.out.println(franceFermeture.toString());

		// System.out.println(franceFermeture.getCommandes()[0].ouvrir());
		// System.out.println(franceFermeture.toString());

		System.out.println(franceFermeture.getCommandes()[0].ouvrir(2.3));
		System.out.println(franceFermeture.toString());

		//System.out.println(franceFermeture.ouvrir(50));
		//System.out.println(franceFermeture.toString());

		//System.out.println(franceFermeture.fermer(10));
		//System.out.println(franceFermeture.toString());

		//System.out.println(franceFermeture.getCommandes()[1].fermer());
		//System.out.println(franceFermeture.toString());

		System.out.println(franceFermeture.getCommandes()[1].fermer(1.5));
		System.out.println(franceFermeture.toString());

		// porte manuelle avec un constructeur avec des variables

		/*
		 * PorteGarageManuelle test1 = new PorteGarageManuelle();
		 * 
		 * PorteGarageManuelle test2 = new PorteGarageManuelle("test", "coulissante",
		 * "PVC", 30.5);
		 * 
		 * System.out.println(test1.toString());
		 * 
		 * System.out.println(test1.ouvrir(23)); System.out.println(test1.toString());
		 * 
		 * System.out.println(test1.fermer(10)); System.out.println(test1.toString());
		 * 
		 * System.out.println(test1.fermer()); System.out.println(test1.toString());
		 * 
		 * System.out.println(test1.ouvrir(40)); System.out.println(test1.toString());
		 * 
		 * System.out.println(test1.ouvrir()); System.out.println(test1.toString());
		 */
	}
}
