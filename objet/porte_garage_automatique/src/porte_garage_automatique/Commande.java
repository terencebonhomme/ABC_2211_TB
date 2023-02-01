package porte_garage_automatique;

public class Commande {

	// attributs

	private final String type;
	private boolean fonctionne;
	private PorteGarageAutomatique porte;

	// constructeurs

	public Commande(String _type, boolean _fonctionne, PorteGarageAutomatique _porte) {
		this.type = _type;
		this.fonctionne = _fonctionne;
		this.setPorte(_porte);
	}

	// getters

	public boolean getFonctionne() {
		return fonctionne;
	}

	public String getType() {
		return type;
	}

	public PorteGarageAutomatique getPorte() {
		return porte;
	}
	
	// setters

	public void setPorte(PorteGarageAutomatique porte) {
		this.porte = porte;
	}
	
	// methodes

	// tout par d�faut
	public boolean ouvrir() {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne
				&& this.getPorte().getPourcentOuverte() < 100) {
			this.getPorte().setPourcentOuverte(100);
			if (this.type == "locale") {
				System.out.println("ouverture depuis une commande locale");
			} else if (this.type == "distante") {
				System.out.println("ouverture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir(double tempsPressionSecondes) {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne
				&& this.getPorte().getPourcentOuverte() < 100) {
			if (tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100
					+ this.getPorte().getPourcentOuverte() <= 100) {
				this.getPorte().setPourcentOuverte(this.getPorte().getPourcentOuverte()
						+ tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100);
				if (this.type == "locale") {
					System.out.println("ouverture depuis une commande locale");
				} else if (this.type == "distante") {
					System.out.println("ouverture depuis une commande distante");
				}
			} else {
				this.getPorte().setPourcentOuverte(100);
			}
			return true;
		} else {
			return false;
		}
	}

	// tout par d�faut
	public boolean fermer() {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne
				&& this.getPorte().getPourcentOuverte() > 0) {
			this.getPorte().setPourcentOuverte(0);
			if (this.type == "locale") {
				System.out.println("fermeture depuis une commande locale");
			} else if (this.type == "distante") {
				System.out.println("fermeture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer(double tempsPressionSecondes) {
		if ((this.type == "locale" || this.type == "distante") && this.fonctionne
				&& this.getPorte().getPourcentOuverte() > 0) {
			if (tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100 <= this.getPorte()
					.getPourcentOuverte()) {
				this.getPorte().setPourcentOuverte(this.getPorte().getPourcentOuverte()
						- tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100);
				if (this.type == "locale") {
					System.out.println("fermeture depuis la commande locale");
				} else if (this.type == "distante") {
					System.out.println("fermeture depuis la commande distante");
				}
			} else {
				this.getPorte().setPourcentOuverte(0);
			}
			return true;
		} else {
			return false;
		}
	}

}
