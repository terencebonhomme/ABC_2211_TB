package aire_volume_sphere;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		// VARIABLES
				
		int rayon;
		double aire;
		double volume;		
		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Veuillez écrire la valeur du rayon R");
		rayon = sc.nextInt();
				
		aire = 4 * pi * Math.pow(rayon, 2);
		System.out.println("L'aire de la sphère est " + aire);
		
		volume = 4/3d * pi * Math.pow(rayon, 3);
		System.out.println("Le volume de la sphère est " + volume);
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
