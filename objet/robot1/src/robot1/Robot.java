package robot1;

public class Robot {

// �num�ration -------------------------------------------------------------

	public enum enumRobot {
		allerAgauche, allerAdroite, monter, descendre, retournerAuDepart, prelever, deposer;

	}

	// Attributs --------------------------------------------------------------

	private String lettres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private char uneLettre;
	private String nomRobot;

	private String maximumX;
	private int maximumXNb;
	private int minimumXNB = 0;

	private int maximumY;
	private int minimumY = 1;

	private String positionX;
	private int positionXNb;
	private int positionY;

	private Boolean colisSurRobot = false;

	// Consturcteurs
	// --------------------------------------------------------------------

	// Robot par d�faut
	public Robot() {
		this.nomRobot = "Robot Kaz Yeah! SA";
		this.maximumX = "J";
		this.maximumXNb = this.correspondanceLettresMaximumX();
		this.maximumY = 5;
		this.positionX = "A";
		this.positionXNb = this.correspondanceLettresPositionX();
		this.positionY = 1;
	}

	// Robot � construire
	public Robot(String _nomRobot, String _maximumX, int _maximumY, String _positionX, int _positionY) {
		this.nomRobot = _nomRobot;
		this.maximumX = _maximumX;
		this.maximumXNb = this.correspondanceLettresMaximumX();
		this.maximumY = _maximumY;
		this.positionX = _positionX;
		this.positionXNb = this.correspondanceLettresPositionX();
		this.positionY = _positionY;
	}

// r�gler des valeurs -----------------------------------------------------------------------	

	public void setPositionX(String _positionX) { // modifier la position horizontale par une lettre
		this.positionX = _positionX;
		this.positionXNb = this.correspondanceLettresPositionX();
	}

	public void setPositionY(int _positionY) { // Modofoer la postion verticale avec un nombre
		this.positionY = _positionY;
	}

// retourner des valeurs -----------------------------------------------------------------------

	// Correspondances entre Lettres et nombres pour l'axe horizontal

	public int correspondanceLettresPositionX() { // correspondance positionX
		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.positionX.charAt(0) == lettres.charAt(i)) {
				this.positionXNb = i;
			}
		}

		return this.positionXNb;
	}

	public int correspondanceLettresMaximumX() { // correspondance maximumX
		for (int i = 0; i < this.lettres.length(); i++) {
			if (this.maximumX.charAt(0) == lettres.charAt(i)) {
				this.maximumXNb = i;
			}
		}

		return this.maximumXNb;
	}

// Correspondances entre nombres et lettres pour l'axe horizontal  

	public void correspondanceNombresPositionX() { // correspondance position X0
		this.uneLettre = this.lettres.charAt(this.positionXNb);
	}

	// un colis est-il pr�sent sur le robot ?

	public boolean getColisSurRobot() {
		return this.colisSurRobot;
	}

//fonctions -----------------------------------------------------------------------

	// aller � gauche ------

	public boolean allerAgauche(int _positionXNb) {
		if (_positionXNb >= this.minimumXNB && _positionXNb < this.positionXNb) {
			this.positionXNb = _positionXNb;
			this.correspondanceNombresPositionX();
			this.positionX = String.valueOf(this.uneLettre);
			return true;
		} else {
			return false;
		}
	}

// aller � droite --------

	public boolean allerAdroite(int _positionXNb) {
		if (_positionXNb <= this.maximumXNb && _positionXNb > this.positionXNb) {
			this.positionXNb = _positionXNb;
			this.correspondanceNombresPositionX();
			this.positionX = String.valueOf(this.uneLettre);
			return true;
		} else {
			return false;
		}
	}

// monter ----

	public boolean monter(int _positionY) {
		if (_positionY > this.positionY && _positionY >= this.minimumY && _positionY <= this.maximumY) {
			this.positionY = _positionY;
			return true;
		} else {
			return false;
		}
	}

// descendre ---- 

	public boolean descendre(int _positionY) {
		if (_positionY < this.positionY && _positionY >= this.minimumY && _positionY <= this.maximumY) {
			this.positionY = _positionY;
			return true;
		} else {
			return false;
		}
	}

// retourner au d�part -----

	public boolean retournerAuDepart() {
		if (!(this.positionXNb == this.minimumXNB && this.positionY == this.minimumY)) {
			this.positionXNb = this.minimumXNB;
			this.correspondanceNombresPositionX();
			this.positionX = String.valueOf(this.uneLettre);
			this.positionY = this.minimumY;
			return true;
		} else {
			return false;
		}
	}

// p�lever un colis ------- 

	public boolean prelever() {
		if (this.colisSurRobot == false || this.positionXNb != this.minimumXNB && this.positionY != this.minimumY) {
			this.colisSurRobot = true;
			return true;
		} else {
			return false;
		}
	}

// d�poser un colis (un colis ne peut �tre d�pos� que au point de d�part) ----

	public boolean deposer() {
		if (this.colisSurRobot == true && this.positionXNb == this.minimumXNB && this.positionY == this.minimumY) {
			this.colisSurRobot = false;
			return true;
		} else {
			return false;
		}
	}

	// to string
	// -------------------------------------------------------------------------

	@Override

	public String toString() {

		return "Nom du robot : " + this.nomRobot + "\r\n" + "Casier minimum horizontal : " + this.minimumXNB + "\r\n"
				+ "Casier maximum horizontal : " + this.maximumXNb + "\r\n" + "Casier minimum vertical : "
				+ this.minimumY + "\r\n" + "Casier maximum vertical : " + this.maximumY + "\r\n"
				+ "Position du robot (horizontale, verticale) : " + this.positionX + ", " + this.positionY + "\r\n"
				+ "positionXNb : " + this.positionXNb + "\r\n" + "Colis sur robot : " + this.colisSurRobot + "\r\n"
				+ "--------------------------------------------------------------";
	}

}