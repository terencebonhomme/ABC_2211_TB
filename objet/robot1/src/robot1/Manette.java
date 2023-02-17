package robot1;

public class Manette {

	private Robot robot;

	public Manette(Robot _robot) {

		this.robot = _robot;
	}

	/**
	 * deplacer le robot a une position absolue selon la position du robot et la
	 * direction
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean allerVers(Direction direction, int position) {

		boolean deplacement = false;

		switch (direction) {
		case HAUT:
			deplacement = this.robot.monter(position);
			break;
		case DROITE:
			deplacement = this.robot.allerAdroite(position);
			break;
		case BAS:
			deplacement = this.robot.descendre(position);
			break;
		case GAUCHE:
			deplacement = this.robot.allerAgauche(position);
			break;
		}

		return deplacement;
	}

	/**
	 * aller directement sur une case
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean allerSur(String x, int y) {

		robot.setPositionX(x);
		robot.setPositionY(y);

		return true;
	}

	/**
	 * aller directement sur une case
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean allerSur(int x, int y) {

		char lettre = (char) ((int) 'A' + x);
		String positionX = String.valueOf(lettre);

		robot.correspondanceNombresPositionX();
		robot.setPositionX(positionX);
		robot.setPositionY(y);

		return true;
	}

	/**
	 * ramener le colis au depot
	 * 
	 * @return
	 */
	public boolean ramenerColis() {

		boolean livraison = false;

		if (this.robot.prelever()) {
			if (this.robot.retournerAuDepart()) {
				livraison = this.robot.deposer();
			}
		}

		return livraison;
	}

	/**
	 * aller chercher un colis et le ramener au depot
	 * 
	 * @param direction
	 * @param distance
	 * @return
	 */
	public boolean ramenerColisVers(Direction direction, int distance) {

		boolean livraison = false;

		if (this.allerVers(direction, distance)) {
			livraison = this.ramenerColis();
		}

		return livraison;
	}

	/**
	 * aller chercher un colis et le ramener au depot
	 * 
	 * @param direction
	 * @param distance
	 * @return
	 */
	public boolean ramenerColisSur(int x, int y) {

		boolean livraison = false;

		if (this.allerSur(x, y)) {
			livraison = this.ramenerColis();
		}

		return livraison;
	}

	/**
	 * aller chercher un colis et le ramener au depot
	 * 
	 * @param direction
	 * @param distance
	 * @return
	 */
	public boolean ramenerColisSur(String x, int y) {

		boolean livraison = false;

		if (this.allerSur(x, y)) {
			livraison = this.ramenerColis();
		}

		return livraison;
	}
}
