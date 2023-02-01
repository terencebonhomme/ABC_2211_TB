package porte_garage_automatique;

public class Batterie {
	
	// attributs
	
	private double pourcentRestant;
	private boolean fonctionne;
	
	// constructeurs
	
	public Batterie() {
		this.pourcentRestant = 100;
		this.fonctionne = true;
	}
	
	public Batterie(double _pourcentRestant, boolean _fonctionne) {
		this.pourcentRestant = _pourcentRestant;
		this.fonctionne = _fonctionne;
	}
	
	// getters

	public double getPourcentRestant() {
		return pourcentRestant;
	}
	
	// setters
	
	public void setPourcentRestant(double pourcentRestant) {
		this.pourcentRestant = pourcentRestant;
	}
	
	public void setFonctionne(boolean fonctionne) {
		this.fonctionne = fonctionne;
	}
	
	// methodes
	
	public boolean isFonctionne() {
		return fonctionne;
	}		
}
