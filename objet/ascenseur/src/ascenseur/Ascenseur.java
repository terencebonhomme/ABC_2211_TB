package ascenseur;

public class Ascenseur {

	// attributs

	private final int nombre_etages;
	private int etage_courant;
	private boolean porte_fermee;
	private boolean alimente;
	private boolean descend;
	private int nombre_personnes;
	private final int capacite_personnes;

	// constructeur

	public Ascenseur() {
		this.nombre_etages = 9;
		this.etage_courant = 8;
		this.porte_fermee = true;
		this.alimente = true;
		this.descend = true;
		this.nombre_personnes = 0;
		this.capacite_personnes = 6;
	}

	public Ascenseur(int _nombre_etages, int _etage_courant, boolean _porte_fermee, boolean _alimente, boolean _descend,
			int _nombre_personnes, int _capacite_personnes) {
		this.nombre_etages = _nombre_etages;
		this.etage_courant = _etage_courant;
		this.porte_fermee = _porte_fermee;
		this.alimente = _alimente;
		this.descend = _descend;
		this.nombre_personnes = _nombre_personnes;
		this.capacite_personnes = _capacite_personnes;
	}

	// methodes

	public boolean monter(int etage, int nombre_personnes_etage) {
		if(nombre_personnes_etage < 0) {			
			return false;
		} else if (this.alimente && etage <= nombre_etages && etage_courant < etage && porte_fermee && !descend) {
			this.etage_courant = etage;
			this.descend = false;
			// les personnes doivent retenter en respectant la capacite
			if (nombre_personnes + nombre_personnes_etage <= capacite_personnes) {
				this.nombre_personnes += nombre_personnes_etage;
			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean descendre(int etage, int nombre_personnes_etage) {
		if(nombre_personnes_etage < 0) {
			return false;
		} else if (alimente && etage >= 0 && etage_courant > etage && porte_fermee) {
			this.etage_courant = etage;
			if (etage == 0) {
				// tout le monde sort de l'ascenseur et l'ascenseur se libere pour la montee
				this.nombre_personnes = 0;
				this.descend = false;
			} else {
				// les personnes doivent retenter en respectant la capacite
				if (nombre_personnes + nombre_personnes_etage <= capacite_personnes) {
					this.nombre_personnes += nombre_personnes_etage;
				} else {
					return false;
				}
				this.descend = true;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean ouvrir() {
		if (this.alimente && this.porte_fermee) {
			this.porte_fermee = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean fermer() {
		if (this.alimente && !this.porte_fermee) {
			this.porte_fermee = true;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nnombre etages : " + nombre_etages + "\netage courant : " + etage_courant + "\nporte fermee : "
				+ porte_fermee + "\nalimente : " + alimente + "\ndescend : " + descend + "\nnombre personnes : "
				+ nombre_personnes + "\n";
	}
}
