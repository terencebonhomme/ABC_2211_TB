package commande;

import porte.PorteGarageAutomatique;

public class CommandeSansBatterie extends Commande {

	// constructeurs

	public CommandeSansBatterie(String _type, boolean _fonctionne, PorteGarageAutomatique _porte) {
		super(_type, _fonctionne, _porte);
		// TODO Auto-generated constructor stub
	}
}
