package bouteille;

public class Bouteille {

	// attributs

	private double contenanceLitre;
	private final double CAPACITE_LITRE;
	private boolean estOuverte;
	private String nom;

	// constructeur

	public Bouteille() {
		System.out.println("on cree une bouteille sans nom de 1 L remplie a 0 L");
		
		contenanceLitre = 0;
		CAPACITE_LITRE = 1;
		estOuverte = false;
		nom = "sans nom";
	}

	public Bouteille(double _contenanceLitre, double _capaciteLitre, boolean _estOuverte, String _nom) {
		System.out.println("on cree une bouteille " + _nom + " de " + _capaciteLitre + " L remplie a " + _contenanceLitre + " L");
		
		contenanceLitre = _contenanceLitre;
		CAPACITE_LITRE = _capaciteLitre;
		estOuverte = _estOuverte;
		nom = _nom;
	}

	// methodes

	public boolean remplir(double quantite) {
		System.out.println("on veut remplir la bouteille " + nom + " remplie a " + contenanceLitre + " L sur " + CAPACITE_LITRE + " L de " + quantite + " L");
		
		if(estOuverte) {
			if (contenanceLitre + quantite <= CAPACITE_LITRE) {
				System.out.println("\ton remplit la bouteille de " + quantite + " L");
				contenanceLitre += quantite;
				return true;
			} else {
				System.out.println("\ton ne peut pas depasser la capacite de la bouteille");
				return false;
			}
		} else {
			System.out.println("\ton ne peut pas remplir une bouteille fermee");
			return false;
		}
	}
	
	public boolean remplirTout() {
		System.out.println("on veut remplir toute la bouteille " + nom);
		
		if(estOuverte) {
			if(contenanceLitre < CAPACITE_LITRE) {
				System.out.println("\ton remplit toute la bouteille");
				contenanceLitre = CAPACITE_LITRE;
				return true;
			} else {
				System.out.println("\ton ne peut pas remplir une bouteille pleine");
				return false;
			}
		} else {
			System.out.println("\ton ne peut pas remplir une bouteille fermée");
			return false;
		}
	}
	
	public boolean vider(double quantite) {
		System.out.println("on veut vider la bouteille " + nom + " remplie à " + contenanceLitre + " L sur " + CAPACITE_LITRE + " L de " + quantite + " L");
		
		if(estOuverte) {
			if(contenanceLitre >= quantite) {
				System.out.println("\ton vide la bouteille de " + quantite + " L");
				contenanceLitre -= quantite;
				return true;
			} else {
				System.out.println("\ton ne peut pas vider plus ce que contient la bouteille");
				return false;
			}
		} else {
			System.out.println("\ton ne peut pas vider une bouteille fermee");
			return false;
		}
		
	}

	public boolean viderTout() {
		System.out.println("on veut vider toute la bouteille " + nom);
		
		if(estOuverte) {
			if(contenanceLitre > 0) {
				System.out.println("\ton vide toute la bouteille");
				contenanceLitre = 0;
				return true;
			} else {
				System.out.println("\ton ne peut pas vider une bouteille vide");
				return false;
			}
		} else {
			System.out.println("\ton ne peut pas vider une bouteille fermee");
			return false;
		}		
	}

	public boolean ouvrir() {
		System.out.println("on veut ouvrir la bouteille " + nom);
		
		if (!estOuverte) {
			System.out.println("\ton ouvre la bouteille");
			estOuverte = true;
			return true;
		} else {
			System.out.println("\ton ne peut pas ouvrir une bouteille ouverte");
			return false;
		}

	}

	public boolean fermer() {
		System.out.println("on veut fermer la bouteille " + nom);
		
		if (estOuverte) {
			System.out.println("\ton ferme la bouteille");
			estOuverte = false;
			return true;
		} else {
			System.out.println("\ton ne peut pas fermer une bouteille fermee");
			return false;
		}		
	}
	
	public String donnerNom(String _nom) {
		System.out.println("on change le nom de la bouteille " + nom + " par " + _nom);
		
		nom = _nom;
		return nom;
	}
}
