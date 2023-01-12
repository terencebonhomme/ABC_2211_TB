package inversion_deux_valeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : a = 5 et b = 7");
		System.out.println("test 2 : a = 5 et b = 5");
		System.out.println("test 3 : a = 10 et b = 2");
		System.out.println("");
		
		// DEBUT PROGRAMME
					
		System.out.println("Ecrire A");
		a = sc.nextInt();
		System.out.println("Ecrire B");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
		
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		System.out.println("");
		if(a == 7 && b == 5) {
			System.out.println("test 1 : " + (a == 7 && b == 5));	
		}
		if(a == 5 && b == 5) {
			System.out.println("test 2 : " + (a == 5 && b == 5));	
		}
		if(a == 2 && b == 10) {
			System.out.println("test 3 : " + (a == 2 && b == 10));	
		}
		
		
		// FIN TESTS
	}

}
