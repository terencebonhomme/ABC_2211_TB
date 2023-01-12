package tri_nombres_plus_plus;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);		
		
		// JEU DE TESTS
		
		System.out.println("test 1 : a = 1, b = 2 et c = 3");
		System.out.println("test 2 : a = 1, b = 3 et c = 2");
		System.out.println("test 3 : a = 2, b = 1 et c = 3");
		System.out.println("test 4 : a = 2, b = 3 et c = 1");
		System.out.println("test 5 : a = 3, b = 1 et c = 2");
		System.out.println("test 6 : a = 3, b = 2 et c = 1");
		System.out.println("");
		System.out.println("test 7 : a = 0,1, b = 0,2 et c = 0,3");
		System.out.println("test 8 : a = 0,1, b = 0,3 et c = 0,2");
		System.out.println("test 9 : a = 0,2, b = 0,1 et c = 0,3");
		System.out.println("test 10 : a = 0,2, b = 0,3 et c = 0,1");
		System.out.println("test 11 : a = 0,3, b = 0,1 et c = 0,2");
		System.out.println("test 12 : a = 0,3, b = 0,2 et c = 0,1");
		System.out.println("");
		System.out.println("test 13 : a = 0,1, b = 0,2 et c = -0,3");
		System.out.println("test 14 : a = 0,1, b = -0,3 et c = 0,2");
		System.out.println("test 15 : a = -0,2, b = 0,1 et c = 0,3");
		System.out.println("test 16 : a = 0,2, b = 0,3 et c = -0,1");
		System.out.println("test 17 : a = 0,3, b = -0,1 et c = 0,2");
		System.out.println("test 18 : a = -0,3, b = 0,2 et c = 0,1");
		System.out.println("");
		
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
