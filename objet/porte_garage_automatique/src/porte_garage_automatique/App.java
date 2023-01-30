package porte_garage_automatique;

public class App {

	public static void main(String[] args) {
		PorteGarageAutomatique laToulousaine = new PorteGarageAutomatique();
		
		PorteGarageAutomatique franceFermeture = new PorteGarageAutomatique("France Fermeture", "moteur a cremaillere", "coulissante", "materiel", false, true, 30.5, 5);
		
		//System.out.println(laToulousaine.toString());		
		
		System.out.println(franceFermeture.toString());
		franceFermeture.ouvrirToutAvecCommande();
		System.out.println(franceFermeture.toString());
	}

}
