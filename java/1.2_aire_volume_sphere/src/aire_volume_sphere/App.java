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
		
		// TESTS
		
		System.out.println("test 1 : rayon = 3");
		System.out.println("test 2 : rayon = 5");
		System.out.println("test 3 : rayon = 12");
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Veuillez écrire la valeur du rayon R");
		rayon = sc.nextInt();
				
		aire = 4 * pi * Math.pow(rayon, 2);
		System.out.println("L'aire de la sphère est " + aire);
		
		volume = 4/3d * pi * Math.pow(rayon, 3);
		System.out.println("Le volume de la sphère est " + volume);
		
		sc.close();
		
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		System.out.println("");
		
		if(rayon == 3) {
			System.out.println("test 1 : aire est " + (aire >= 113.097 && aire <= 113.098) + " et volume est " + (volume >= 113.097 && volume <= 113.098));
		}
		
		if(rayon == 5) {
			System.out.println("test 2 : aire est " + (aire >= 314.159 && aire <= 314.160) + " et volume est " + (volume >= 523.598  && volume <= 523.599));
		}

		if(rayon == 12) {
			System.out.println("test 3 : aire est " + (aire >= 1809.557 && aire <= 1809.558) + " et volume est " + (volume >= 7238.229  && volume <= 7238.230));
		}

		
		// FIN TESTS
	}

}
