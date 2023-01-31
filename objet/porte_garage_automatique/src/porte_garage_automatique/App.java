package porte_garage_automatique;

public class App {

	public static void main(String[] args) {
		PorteGarageAutomatique laToulousaine = new PorteGarageAutomatique();
		
		System.out.println(laToulousaine.toString());
		
		//System.out.println(laToulousaine.getCommandes()[0].ouvrir());
		//System.out.println(laToulousaine.toString());
		
		System.out.println(laToulousaine.getCommandes()[0].ouvrir(2));
		System.out.println(laToulousaine.toString());
		
		//System.out.println(laToulousaine.getCommandes()[1].fermer());
		//System.out.println(laToulousaine.toString());
		
		System.out.println(laToulousaine.getCommandes()[1].fermer(1));
		System.out.println(laToulousaine.toString());
		
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
