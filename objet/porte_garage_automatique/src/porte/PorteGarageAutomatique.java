package porte;

import batterie.Batterie;
import commande.Commande;
import commande.CommandeAvecBatterie;
import commande.CommandeSansBatterie;

public class PorteGarageAutomatique extends PorteGarage {

	// attributs

	private final String typeMoteur;
	private Commande[] commandes;
	private final double tempsOuverture;

	// constructeurs

	public PorteGarageAutomatique() {
		super("sans nom", "battante", "PVC", 0.0);
		Batterie batterie = new Batterie();
		this.typeMoteur = "moteur a cremaillere";
		this.commandes = new Commande[] { new CommandeSansBatterie("locale", true, this),
				new CommandeAvecBatterie("distante", true, this, batterie) };
		this.pourcentOuverte = 0;
		this.tempsOuverture = 5;
	}

	public PorteGarageAutomatique(String _nom, String _typeMoteur, String _typePorte, String _materiel,
			double _pourcentOuverte, double _tempsOuverture) {
		super(_nom, _typePorte, _materiel, _tempsOuverture);
		this.typeMoteur = _typeMoteur;
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

		for (int i = 0; i < this.commandes.length; i++) {
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
					+ "; fonctionne : " + this.commandes[i].getFonctionne() + "; porte : "
					+ this.commandes[i].getPorte().getNom();
		}

		return "nom = " + this.nom + "\ntypeMoteur = " + this.typeMoteur + "\ntypePorte = " + this.typePorte
				+ "\nmateriel = " + this.materiel + "\npourcentOuverte = " + this.pourcentOuverte + commandes;
	}

}
