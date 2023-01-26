package inverser_variables;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES

		int a, b;
		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME
		
		System.out.print("Saisir a : ");
		a = sc.nextInt();
		System.out.print("Saisir b : ");
		b = sc.nextInt();

		inverser(a, b);

		// FIN PROGRAMME
	}

	public static void inverser(int a, int b) {
		
		// VARIABLES

		int temp;

		// DEBUT PROCEDURE

		temp = a;
		a = b;
		b = temp;

		System.out.println("a vaut " + a + " et b vaut " + b);

		// FIN PROCEDURE
	}

}
