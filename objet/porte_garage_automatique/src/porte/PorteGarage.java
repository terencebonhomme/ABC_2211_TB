package porte;

public abstract class PorteGarage {
	
	protected final String nom;
	protected final String typePorte;
	protected final String materiel;
	protected double pourcentOuverte;
	protected boolean verouillee;
	
	// constructeur
	
	public PorteGarage(String _nom, String _typePorte, String _materiel, double _pourcentOuverte, boolean _verouillee) {
		this.nom = _nom;
		this.typePorte = _typePorte;
		this.materiel = _materiel;
		this.pourcentOuverte = _pourcentOuverte;
		this.verouillee = _verouillee;
	}
	
	// getters
	
	public String getNom() {
		return nom;
	}
	
	public String getTypePorte() {
		return typePorte;
	}

	public String getMateriel() {
		return materiel;
	}
	
	public double getPourcentOuverte() {
		return pourcentOuverte;
	}
	
	public boolean getVerouillee() {
		return verouillee;
	}
	
	// methodes
	
	public boolean ouvrir() {
		System.out.println("ouvrir porte");
		if (this.pourcentOuverte < 100 && !this.verouillee) {
			this.pourcentOuverte = 100;
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir(double pourcentOuverture) {
		System.out.println("ouvrir porte");
		if(pourcentOuverture < 0) {
			return false;
		} else if (this.pourcentOuverte + pourcentOuverture < 100 && !this.verouillee) {
			this.pourcentOuverte += pourcentOuverture;
			return true;
		} else if (this.pourcentOuverte < 100 && !this.verouillee) {
			this.pourcentOuverte = 100;
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer() {
		System.out.println("fermer porte");
		if (this.pourcentOuverte > 0 && !this.verouillee) {
			this.pourcentOuverte = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean fermer(double pourcentOuverture) {
		System.out.println("fermer porte");
		if(pourcentOuverture < 0) {
			return false;
		} else if (this.pourcentOuverte - pourcentOuverture > 0 && !this.verouillee) {
			this.pourcentOuverte -= pourcentOuverture;		
			return true;
		} else if(this.pourcentOuverte > 0 & !this.verouillee) {
			this.pourcentOuverte = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verouiller() {
		if(!this.verouillee) {
			this.verouillee = true;
			return true;
		} else {
			return false;
		}
		
	}
}
