package perimetre_aire_triangle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.print("Saisir a : ");
		a = sc.nextDouble();
		
		System.out.print("Saisir b : ");
		b = sc.nextDouble();
		
		System.out.print("Saisir c : ");
		c = sc.nextDouble();
		
		perimetre(a, b, c);
		aire(a, b, c);
		
		sc.close();		
		
		// FIN PROGRAMME
	}
	
	public static void perimetre(double a, double b, double c) {
		
		// VARIABLES
		
		double p;
		
		// DEBUT PROCEDURE
		
		p = a + b + c;
		System.out.println("perimetre : " + p);
		
		// FIN PROCEDURE
	}
	
	public static void aire(double a, double b, double c) {
		
		// VARIABLES
		
		double p, aire;
		
		// DEBUT PROCEDURE
		
		p = a + b + c;
		aire = Math.pow((p/2 - a) * (p/2 - b) * (p/2 - c), 0.5);
		System.out.println("aire : " + aire);
		
		// FIN PROCEDURE
	}

}
