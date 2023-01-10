package tri_nombres_plus_plus;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);		
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir A");
		a = sc.nextDouble();
		System.out.println("Saisir B");
		b = sc.nextDouble();
		System.out.println("Saisir C");
		c = sc.nextDouble();
		
		if(a < b) {
			if(a < c) {
				if(c < b) {
					System.out.println(a + "; " + c + "; " + b);
				} else {
					System.out.println(a + "; " + b + "; " + c);
				}
			} else {
				System.out.println(c + "; " + a + "; " + b);
			}
		} else {
			if(a < c) {
				System.out.println(b + "; " + a + "; " + c);
			} else {
				if(c < b) {
					System.out.println(c + "; " + b + "; " + a);
				} else {
					System.out.println(b + "; "+ c + "; " + a);
				}
			}			
		}
						
		sc.close();
				
		// FIN PROGRAMME
	}

}
