package moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		double a, b;
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
						
		System.out.println("Saisir a : ");
		a = sc.nextDouble();
		
		System.out.println("Saisir b : ");
		b = sc.nextDouble();
		
		System.out.println(moyenne(a,b));
		
		sc.close();
		
		// FIN PROGRAMME

	}
	
	public static double moyenne(double a, double b) {
		
		// DEBUT FONCTION
		
		return (a + b) / 2;
		
		// FIN FONCTION
	}

}
