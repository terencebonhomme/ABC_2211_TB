package moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) 
	{
		// VARIABLES
		
		int nombre1;
		int nombre2;
		double moyenne;		
		
		Scanner sc = new Scanner(System.in);
		
		// TESTS
		
		System.out.println("test 1 : 3 et 5");
		System.out.println("test 2 : 4 et 4");
		System.out.println("test 3 : 4 et 5");
		System.out.println("test 4 : -2 et 5");
		
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Programme de calcul de la moyenne de 2 nombres");
		
		System.out.println("Veuillez saisir un premier nombre");
		nombre1 = sc.nextInt();
		System.out.println("Vous avez saisi: " + nombre1);
		
		System.out.println("Veuillez saisir un second nombre");
		nombre2 = sc.nextInt();
		System.out.println("Vous avez saisi: " + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2d;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne);	
		
		sc.close();
		
		// FIN PROGRAMME
		
		// DEBUT TESTS			
		
		System.out.println("");
		
		if(nombre1 == 3 && nombre2 == 5) {
			System.out.println("test 1 : " + (moyenne == 4.0));
		}
		
		if(nombre1 == 4 && nombre2 == 4) {
			System.out.println("test 2 : " + (moyenne == 4.0));
		}
		
		if(nombre1 == 4 && nombre2 == 5) {
			System.out.println("test 3 : " + (moyenne == 4.5));
		}
		
		if(nombre1 == -2 && nombre2 == 5) {
			System.out.println("test 4 : " + (moyenne == 1.5));
		}
		
		// FIN TESTS
	}

}
