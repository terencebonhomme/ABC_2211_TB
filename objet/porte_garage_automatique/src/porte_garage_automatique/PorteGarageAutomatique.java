package porte_garage_automatique;

public class PorteGarageAutomatique {

	// attributs

	private String nom;
	private final String typeMoteur;
	private final String typePorte;
	private final String materiel;
	private Commande[] commandes;
	private double pourcentOuverte;
	private final double tempsOuverture;

	// constructeurs

	public PorteGarageAutomatique() {
		this.nom = "";
		this.typeMoteur = "moteur a cremaillere";
		this.typePorte = "battante";
		this.materiel = "PVC";
		this.commandes = new Commande[] { new Commande("locale", true, this), new Commande("distante", true, this) };
		this.pourcentOuverte = 0;
		this.tempsOuverture = 5;
	}

	public PorteGarageAutomatique(String _nom, String _typeMoteur, String _typePorte, String _materiel, double _pourcentOuverte, double _tempsOuverture) {
		this.nom = _nom;
		this.typeMoteur = _typeMoteur;
		this.typePorte = _typePorte;
		this.materiel = _materiel;
		this.pourcentOuverte = _pourcentOuverte;
		this.tempsOuverture = _tempsOuverture;
	}

	// getters

	public String getNom() {
		return nom;
	}

	public String getTypeMoteur() {
		return typeMoteur;
	}

	public String getTypePorte() {
		return typePorte;
	}

	public String getMateriel() {
		return materiel;
	}

	public Commande[] getCommandes() {
		return commandes;
	}
	
	public double getPourcentOuverte() {
		return pourcentOuverte;
	}

	public double getTempsOuverture() {
		return tempsOuverture;
	}
	
	// setters
	
	public void setCommandes(Commande[] liste) {
		this.commandes = liste;
	}
	
	public void setPourcentOuverte(double pourcentage) {
		this.pourcentOuverte = pourcentage;
	}
	
	// methode
	
	public void ajouterCommande(Commande commande) {
		Commande[] liste_commande = new Commande[this.commandes.length + 1];
		
		for(int i = 0; i < this.commandes.length; i++) {
			liste_commande[i] = this.commandes[i];
		}
		
		liste_commande[liste_commande.length - 1] = commande;
		
		this.commandes = liste_commande;
	}

	@Override
	public String toString() {
		String commandes = "";

		// liste des commandes de la porte
		for (int i = 0; i < this.commandes.length; i++) {
			commandes = commandes + "\n\tcommande " + i + " => type : " + this.commandes[i].getType()
					+ "; fonctionne : " + this.commandes[i].getFonctionne();
		}

		return "nom = " + this.nom + "\ntypeMoteur = " + this.typeMoteur + "\ntypePorte = " + this.typePorte
				+ "\nmateriel = " + this.materiel + "\npourcentOuverte = " + this.pourcentOuverte + commandes;
	}

}
