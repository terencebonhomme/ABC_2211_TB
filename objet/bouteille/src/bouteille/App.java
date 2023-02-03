package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille eau = new Bouteille(1.5, 1.5, false, "eau");
		
		System.out.println(eau.toString());
		
		System.out.println(eau.vider(0.7));
		System.out.println(eau.toString());
		
		System.out.println(eau.vider(-0.5));
		System.out.println(eau.toString());
		
		System.out.println(eau.ouvrir());
		System.out.println(eau.toString());
		
		System.out.println(eau.ouvrir());
		System.out.println(eau.toString());
		
		System.out.println(eau.viderTout());
		System.out.println(eau.toString());
		
		System.out.println(eau.remplirTout());
		System.out.println(eau.toString());
		
		System.out.println(eau.donnerNom("eau gazeuse"));
		System.out.println(eau.toString());
		
		System.out.println(eau.vider(0.5));
		System.out.println(eau.toString());
		
		System.out.println(eau.remplir(0.6));
		System.out.println(eau.toString());
		
		System.out.println(eau.remplir(-0.8));
		System.out.println(eau.toString());
		
		System.out.println("");
		
		Bouteille soda = new Bouteille();
		
		soda.donnerNom("soda");
		System.out.println(soda.toString());
		
		System.out.println(soda.vider(0.5));
		System.out.println(soda.toString());
		
		System.out.println(soda.ouvrir());
		System.out.println(soda.toString());
		
		//soda.vider(0.5);
		//System.out.println(soda.toString());
		
		System.out.println(soda.remplir(10));
		System.out.println(soda.toString());
		
		System.out.println(soda.remplir(1));
		System.out.println(soda.toString());
		
		System.out.println(soda.remplir(-1));
		System.out.println(soda.toString());
		
		System.out.println(soda.vider(0.5));
		System.out.println(soda.toString());
		
		System.out.println(soda.vider(-0.6));
		System.out.println(soda.toString());
		
		System.out.println(soda.viderTout());
		System.out.println(soda.toString());
		
		System.out.println(soda.vider(0.4));
		System.out.println(soda.toString());
		
		System.out.println(soda.remplirTout());
		System.out.println(soda.toString());
		
		System.out.println(soda.fermer());
		System.out.println(soda.toString());
		
		System.out.println(soda.viderTout());
		System.out.println(soda.toString());
		
		System.out.println(soda.fermer());
		System.out.println(soda.toString());
		
		System.out.println(soda.remplirTout());
		System.out.println(soda.toString());
		
		System.out.println(soda.remplir(0.5));
		System.out.println(soda.toString());
	}

}
