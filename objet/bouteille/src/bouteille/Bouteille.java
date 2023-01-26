package bouteille;

public class Bouteille {
	
	double volumeCourant = 150.00;
	final double VOLUME_MAX = 150.00;
	boolean ouvert = false;
	
	public void remplir(double volumeAjoute) {
		if(this.volumeCourant + volumeAjoute <= this.VOLUME_MAX) {
			System.out.println(this.volumeCourant);
			this.volumeCourant += volumeAjoute;
			System.out.println(this.volumeCourant);
		}else {
			this.volumeCourant = this.VOLUME_MAX;
			System.out.println("exces : " + (this.volumeCourant + volumeAjoute - this.VOLUME_MAX));
		}
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
