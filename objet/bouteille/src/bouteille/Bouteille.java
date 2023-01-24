package bouteille;

public class Bouteille {
	
	double volumeCourant = 150.00;
	boolean ouvert = false;
	
	public void remplir() {
		this.volumeCourant = 150.00;
	}
	
	public void vider() {
		this.volumeCourant = 0.00;
	}
	
	public void ouvrir() {
		this.ouvert = true;
	}
	
	public void fermer() {
		this.ouvert = false;
	}
}
