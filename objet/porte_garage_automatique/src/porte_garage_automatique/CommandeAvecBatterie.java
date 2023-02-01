package porte_garage_automatique;

public class CommandeAvecBatterie extends Commande {
	
	// attributs

	private boolean aBatterieDedans; // TODO variable à retirer pour redondance ?
	private Batterie batterieDedans;

	// constructeurs
	
	public CommandeAvecBatterie(String _type, boolean _fonctionne, PorteGarageAutomatique _porte,
			boolean _aBatterieDedans, Batterie _batterieDedans) {
		super(_type, _fonctionne, _porte);
		this.aBatterieDedans = _aBatterieDedans;
		this.batterieDedans = _batterieDedans;
	}
	
	// methodes

	@Override
	public boolean ouvrir() {
		if ((super.getType() == "locale" || super.getType() == "distante") && super.getFonctionne()
				&& super.getPorte().getPourcentOuverte() < 100 && this.aBatterieDedans && this.batterieDedans.getPourcentRestant() > 0) {
			this.getPorte().setPourcentOuverte(100);
			if (super.getType() == "locale") {
				System.out.println("ouverture depuis une commande locale");
			} else if (super.getType() == "distante") {
				System.out.println("ouverture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean ouvrir(double tempsPressionSecondes) {
		if ((super.getType() == "locale" || super.getType() == "distante") && super.getFonctionne()
				&& this.getPorte().getPourcentOuverte() < 100 && this.aBatterieDedans && this.batterieDedans.getPourcentRestant() > 0) {
			if (tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100
					+ this.getPorte().getPourcentOuverte() <= 100) {
				this.getPorte().setPourcentOuverte(this.getPorte().getPourcentOuverte()
						+ tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100);
				if (super.getType() == "locale") {
					System.out.println("ouverture depuis une commande locale");
				} else if (super.getType() == "distante") {
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

	@Override
	public boolean fermer() {
		if ((super.getType() == "locale" || super.getType() == "distante") && super.getFonctionne()
				&& this.getPorte().getPourcentOuverte() > 0 && this.aBatterieDedans && this.batterieDedans.getPourcentRestant() > 0) {
			this.getPorte().setPourcentOuverte(0);
			if (super.getType() == "locale") {
				System.out.println("fermeture depuis une commande locale");
			} else if (super.getType() == "distante") {
				System.out.println("fermeture depuis une commande distante");
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean fermer(double tempsPressionSecondes) {
		if ((super.getType() == "locale" || super.getType() == "distante") && super.getFonctionne()
				&& this.getPorte().getPourcentOuverte() > 0) {
			if (tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100 <= this.getPorte()
					.getPourcentOuverte() && this.aBatterieDedans && this.batterieDedans.getPourcentRestant() > 0) {
				this.getPorte().setPourcentOuverte(this.getPorte().getPourcentOuverte()
						- tempsPressionSecondes / this.getPorte().getTempsOuverture() * 100);
				if (super.getType() == "locale") {
					System.out.println("fermeture depuis la commande locale");
				} else if (super.getType() == "distante") {
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
