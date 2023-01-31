package porte_garage_automatique;

public class Commande {

	// attributs

	private final String type;
	private boolean fonctionne;
	private PorteGarageAutomatique porte;

	// constructeur

	public Commande(String _type, boolean _fonctionne, PorteGarageAutomatique _porte) {
		this.type = _type;
		this.fonctionne = _fonctionne;
		this.porte = _porte;
	}

	// methodes

	public boolean getFonctionne() {
		return this.fonctionne;
	}

	public String getType() {
		return this.type;
	}

	public boolean ouvrir() {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne && this.porte.getPourcentOuverte() < 100) {
			this.porte.setPourcentOuverte(100);
			if(this.type == "locale") {
				System.out.println("ouverture depuis une commande locale");
			} else if(this.type == "distante") {
				System.out.println("ouverture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir(double tempsPressionSecondes) {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne && this.porte.getPourcentOuverte() < 100) {
			if (tempsPressionSecondes / this.porte.getTempsOuverture() * 100 + this.porte.getPourcentOuverte() <= 100) {
				this.porte.setPourcentOuverte(
						this.porte.getPourcentOuverte() + tempsPressionSecondes / this.porte.getTempsOuverture() * 100);
				if(this.type == "locale") {
					System.out.println("ouverture depuis une commande locale");
				} else if(this.type == "distante") {
					System.out.println("ouverture depuis une commande distante");
				}
			} else {
				this.porte.setPourcentOuverte(100);
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer() {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne
				&& this.porte.getPourcentOuverte() > 0) {
			this.porte.setPourcentOuverte(0);
			if(this.type == "locale") {
				System.out.println("fermeture depuis une commande locale");
			} else if(this.type == "distante") {
				System.out.println("fermeture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer(double tempsPressionSecondes) {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne && this.porte.getPourcentOuverte() > 0) {
			if (tempsPressionSecondes / this.porte.getTempsOuverture() * 100 <= this.porte.getPourcentOuverte()) {
				this.porte.setPourcentOuverte(
						this.porte.getPourcentOuverte() - tempsPressionSecondes / this.porte.getTempsOuverture() * 100);
				if(this.type == "locale") {
					System.out.println("fermeture depuis la commande locale");
				} else if(this.type == "distante") {
					System.out.println("fermeture depuis la commande distante");
				}
			} else {
				this.porte.setPourcentOuverte(0);
			}
			return true;
		} else {
			return false;
		}
	}

}
