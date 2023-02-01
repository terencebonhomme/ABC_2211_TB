package porte_garage_automatique;

public class App {

	public static void main(String[] args) {
		
		// porte avec un constructeur par défaut
		
		PorteGarageAutomatique laToulousaine = new PorteGarageAutomatique();
		
		System.out.println(laToulousaine.toString());
		
		// batteries
		
		Batterie batterie_1 = new Batterie(40, true);
		Batterie batterie_2 = new Batterie(0, true);
		Batterie batterie_3 = new Batterie(0, false);
		Batterie batterie_4 = new Batterie(60, false);
		Batterie batterie_5 = new Batterie();
		
		// commandes
				
		CommandeAvecBatterie commande_supplementaire_1 = new CommandeAvecBatterie("locale", true, laToulousaine, true, batterie_1);
		CommandeAvecBatterie commande_supplementaire_2 = new CommandeAvecBatterie("distante", true, laToulousaine, false, batterie_2);
		CommandeSansBatterie commande_supplementaire_3 = new CommandeSansBatterie("distante", true, laToulousaine);
		laToulousaine.ajouterCommande(commande_supplementaire_1);
		laToulousaine.ajouterCommande(commande_supplementaire_2);
		laToulousaine.ajouterCommande(commande_supplementaire_3);
		
		System.out.println(laToulousaine.toString());
		
		//System.out.println(laToulousaine.getCommandes()[0].ouvrir());
		//System.out.println(laToulousaine.toString());
		
		System.out.println(laToulousaine.getCommandes()[2].ouvrir(2));
		System.out.println(laToulousaine.toString());
		
		//System.out.println(laToulousaine.getCommandes()[1].fermer());
		//System.out.println(laToulousaine.toString());
		
		System.out.println(laToulousaine.getCommandes()[2].fermer(1));
		System.out.println(laToulousaine.toString());
		
		// porte avec un constructeur avec des variables
		
		PorteGarageAutomatique franceFermeture = new PorteGarageAutomatique("France Fermeture", "moteur a cremaillere", "coulissante", "materiel",  30.5, 5);
		Commande[] liste_commandes = new Commande[] {new Commande("locale", true, franceFermeture), new Commande("distante", true, franceFermeture)};
		franceFermeture.setCommandes(liste_commandes);
		
		//System.out.println(franceFermeture.toString());
		
		//System.out.println(franceFermeture.getCommandes()[0].ouvrir());
		//System.out.println(franceFermeture.toString());
		
		//System.out.println(franceFermeture.getCommandes()[0].ouvrir(2.3));
		//System.out.println(franceFermeture.toString());
		
		//System.out.println(franceFermeture.getCommandes()[1].fermer());
		//System.out.println(franceFermeture.toString());
		
		//System.out.println(franceFermeture.getCommandes()[1].fermer(1.5));
		//System.out.println(franceFermeture.toString());
	}

}
