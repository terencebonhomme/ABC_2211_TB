package porte;

public abstract class PorteGarage {
	
	protected final String nom;
	protected final String typePorte;
	protected final String materiel;
	protected double pourcentOuverte;
	
	// constructeur
	
	public PorteGarage(String _nom, String _typePorte, String _materiel, double _pourcentOuverte) {
		this.nom = _nom;
		this.typePorte = _typePorte;
		this.materiel = _materiel;
		this.pourcentOuverte = _pourcentOuverte;
	}
	
	// methodes
	
	public boolean ouvrir() {
		if (this.pourcentOuverte < 100) {
			this.pourcentOuverte = 100;
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir(double pourcentOuverture) {
		if (this.pourcentOuverte + pourcentOuverture < 100) {
			this.pourcentOuverte += pourcentOuverture;
			return true;
		} else if (this.pourcentOuverte < 100) {
			this.pourcentOuverte = 100;
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer() {
		if (this.pourcentOuverte > 0) {
			this.pourcentOuverte = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean fermer(double pourcentOuverture) {
		if (this.pourcentOuverte - pourcentOuverture > 0) {
			this.pourcentOuverte -= pourcentOuverture;		
			return true;
		} else if(this.pourcentOuverte > 0) {
			this.pourcentOuverte = 0;
			return true;
		} else {
			return false;
		}
	}
}
