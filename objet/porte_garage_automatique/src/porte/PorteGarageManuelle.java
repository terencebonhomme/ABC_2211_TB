package porte;

public class PorteGarageManuelle extends PorteGarage {

	// constructeurs
	
	public PorteGarageManuelle() {
		super("sans nom", "battante", "PVC", 0.0);
	}
	
	public PorteGarageManuelle(String _nom, String _typePorte, String _materiel, double _pourcentOuverte) {
		super(_nom, _typePorte, _materiel, _pourcentOuverte);
		// TODO Auto-generated constructor stub
	}
	
	// methode
	
	@Override
	public String toString() {
		return "nom = " + this.nom + "\ntypePorte = " + this.typePorte
				+ "\nmateriel = " + this.materiel + "\npourcentOuverte = " + this.pourcentOuverte + "\n";
	}

}
