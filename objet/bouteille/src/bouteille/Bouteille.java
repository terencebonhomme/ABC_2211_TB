package bouteille;

public class Bouteille {

	// attributs

	private double contenanceLitre;
	private final double CAPACITE_LITRE;
	private boolean estOuverte;
	private String nom;

	// constructeur

	public Bouteille() {
		//System.out.println("on cree une bouteille sans nom de 1 L remplie a 0 L");
		
		this.contenanceLitre = 0;
		this.CAPACITE_LITRE = 1;
		this.estOuverte = false;
		this.nom = "sans nom";
	}

	public Bouteille(double _contenanceLitre, double _capaciteLitre, boolean _estOuverte, String _nom) {
		//System.out.println("on cree une bouteille " + _nom + " de " + _capaciteLitre + " L remplie a " + _contenanceLitre + " L");
		
		this.contenanceLitre = _contenanceLitre;
		this.CAPACITE_LITRE = _capaciteLitre;
		this.estOuverte = _estOuverte;
		this.nom = _nom;
	}

	// methodes

	public boolean remplir(double quantiteLitre) {
		//System.out.println("on veut remplir la bouteille " + this.nom + " remplie a " + this.contenanceLitre + " L sur " + this.CAPACITE_LITRE + " L de " + quantiteLitre + " L");
		if(quantiteLitre < 0) {
			//System.out.println("\tla quantite doit être positive");
			return false;
		}else if(this.estOuverte) {
			if (this.contenanceLitre + quantiteLitre <= this.CAPACITE_LITRE) {
				//System.out.println("\ton remplit la bouteille de " + quantiteLitre + " L");
				this.contenanceLitre += quantiteLitre;
				return true;
			} else {
				//System.out.println("\ton ne peut pas depasser la capacite de la bouteille");
				return false;
			}
		} else {
			//System.out.println("\ton ne peut pas remplir une bouteille fermee");
			return false;
		}
	}
	
	public boolean remplirTout() {
		//System.out.println("on veut remplir toute la bouteille " + this.nom);
		
		if(this.estOuverte) {
			if(this.contenanceLitre < this.CAPACITE_LITRE) {
				//System.out.println("\ton remplit toute la bouteille");
				this.contenanceLitre = this.CAPACITE_LITRE;
				return true;
			} else {
				//System.out.println("\ton ne peut pas remplir une bouteille pleine");
				return false;
			}
		} else {
			//System.out.println("\ton ne peut pas remplir une bouteille fermee");
			return false;
		}
	}
	
	public boolean vider(double quantiteLitre) {
		//System.out.println("on veut vider la bouteille " + this.nom + " remplie a " + this.contenanceLitre + " L sur " + this.CAPACITE_LITRE + " L de " + quantiteLitre + " L");
		
		if(quantiteLitre < 0) {
			//System.out.println("\tla quantite doit être positive");
			return false;
		} else if(this.estOuverte) {
			if(this.contenanceLitre >= quantiteLitre) {
				//System.out.println("\ton vide la bouteille de " + quantiteLitre + " L");
				this.contenanceLitre -= quantiteLitre;
				return true;
			} else {
				//System.out.println("\ton ne peut pas vider plus ce que contient la bouteille");
				return false;
			}
		} else {
			//System.out.println("\ton ne peut pas vider une bouteille fermee");
			return false;
		}
		
	}

	public boolean viderTout() {
		//System.out.println("on veut vider toute la bouteille " + this.nom);
		
		if(this.estOuverte) {
			if(this.contenanceLitre > 0) {
				//System.out.println("\ton vide toute la bouteille");
				this.contenanceLitre = 0;
				return true;
			} else {
				//System.out.println("\ton ne peut pas vider une bouteille vide");
				return false;
			}
		} else {
			//System.out.println("\ton ne peut pas vider une bouteille fermee");
			return false;
		}		
	}

	public boolean ouvrir() {
		//System.out.println("on veut ouvrir la bouteille " + this.nom);
		
		if (!this.estOuverte) {
			//System.out.println("\ton ouvre la bouteille");
			this.estOuverte = true;
			return true;
		} else {
			//System.out.println("\ton ne peut pas ouvrir une bouteille ouverte");
			return false;
		}

	}

	public boolean fermer() {
		//System.out.println("on veut fermer la bouteille " + this.nom);
		
		if (this.estOuverte) {
			//System.out.println("\ton ferme la bouteille");
			this.estOuverte = false;
			return true;
		} else {
			//System.out.println("\ton ne peut pas fermer une bouteille fermee");
			return false;
		}		
	}
	
	public String donnerNom(String nom) {
		//System.out.println("on change le nom de la bouteille " + this.nom + " par " + nom);
		
		this.nom = nom;
		return this.nom;
	}
	
	public String toString() {
		return "contenanceLitre = " + contenanceLitre + "\nCAPACITE_LITRE = " + CAPACITE_LITRE + "\nestOuverte = " + estOuverte + "\nnom = " + nom + "\n";
	}
}
