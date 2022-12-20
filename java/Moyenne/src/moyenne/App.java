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
		
		// DEBUT PROGRAMME
		
		System.out.println("Programme de calcul de la moyenne de 2 nombres");
		
		System.out.println("Veuillez saisir un premier nombre");
		nombre1 = sc.nextInt();
		System.out.println("Vous avez saisi: " + nombre1);
		
		System.out.println("Veuillez saisir un deuxième nombre");
		nombre2 = sc.nextInt();
		System.out.println("Vous avez saisi: " + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2d;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne);	
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
