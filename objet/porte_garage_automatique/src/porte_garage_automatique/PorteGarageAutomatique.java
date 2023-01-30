package porte_garage_automatique;

public class PorteGarageAutomatique {
	
	// attributs
	
	private String nom;
	private final String typeMoteur;
	private final String typePorte;
	private final String materiel;
	private boolean aCommandeDistante;
	private boolean aCommandeLocale;	
	private double pourcentOuverte;
	private final double tempsOuverture; 
	
	// constructeurs
	
	public PorteGarageAutomatique() {	
		this.nom = "";
		this.typeMoteur = "moteur a cremaillere";
		this.typePorte = "battante";
		this.materiel = "PVC";
		this.aCommandeLocale = true;
		this.aCommandeDistante = false;
		this.pourcentOuverte = 0;
		this.tempsOuverture = 5;
	}
	
	public PorteGarageAutomatique(
			String _nom,
			String _typeMoteur, 
			String _typePorte, 
			String _materiel, 
			boolean _aCommandeLocale, 
			boolean _aCommandeDistante, 
			double _pourcentOuverte,
			double _tempsOuverture) 
	{
		this.nom = _nom;
		this.typeMoteur = _typeMoteur;
		this.typePorte = _typePorte;
		this.materiel = _materiel;
		this.aCommandeLocale = _aCommandeLocale;
		this.aCommandeDistante = _aCommandeDistante;
		this.pourcentOuverte = _pourcentOuverte;
		this.tempsOuverture = _tempsOuverture;		
	}
	
	// méthodes
	
	public boolean ouvrirToutAvecCommande() {	
		if(this.pourcentOuverte > 0) {
			this.pourcentOuverte = 100;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean ouvrirAvecCommande(double tempsPressionSecondes) {
		if(this.pourcentOuverte > 0) {
			if(tempsPressionSecondes / this.tempsOuverture * 100 <= 100) {
				this.pourcentOuverte += tempsPressionSecondes / this.tempsOuverture * 100;
			} else {
				this.pourcentOuverte = 100;
			}
			return true;
		} else {
			return false;
		}				
	}
	
	public boolean fermerToutAvecTelecommande() {
		if(this.pourcentOuverte < 100) {
			this.pourcentOuverte = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean fermerAvecTelecommande(double tempsPressionSecondes) {
		if(this.pourcentOuverte < 100) {
			if(tempsPressionSecondes / this.tempsOuverture * 100 <= this.pourcentOuverte) {
				this.pourcentOuverte += tempsPressionSecondes / this.tempsOuverture * 100;
			} else {
				this.pourcentOuverte = 0;
			}
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public String toString() {
		return 
			"nom = " + this.nom + "\n" +
			"typeMoteur = " + this.typeMoteur + "\n" + 
			"typePorte = " + this.typePorte + "\n" +
			"materiel = " + this.materiel + "\n" +
			"aCommandeLocale = " + this.aCommandeLocale + "\n" +
			"aCommandeDistante = " + this.aCommandeDistante + "\n" +
			"pourcentOuverte = " + this.pourcentOuverte + "\n";											
	}

}
