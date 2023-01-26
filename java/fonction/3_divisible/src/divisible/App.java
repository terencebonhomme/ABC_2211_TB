package divisible;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		// PROGRAMME
		
		System.out.print("Saisir a : ");
		a = sc.nextInt();
		System.out.print("Saisir b : ");
		b = sc.nextInt();
		
		if(estDivisible(a, b)) {
			System.out.println(a + " est divisible par " + b);	
		} else {
			System.out.println(a + " n'est pas divisible par " + b);
		}
				
		// FIN PROGRAMME

	}
	
	public static boolean estDivisible(int a, int b) {
		
		// PROGRAMME
		
		return a % b == 0;
		
		// FIN PROGRAMME
	}

}
