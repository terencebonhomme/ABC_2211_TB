package diviseurs_nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : 5 avec aucun diviseur");
		System.out.println("test 2 : 4 avec le diviseur 2");
		System.out.println("test 3 : 16 avec les diviseurs 2, 4, 8");
		System.out.println("test 4 : 10 avec les diviseurs 2, 5");
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(i = nombre - 1; i >= 2; i = i - 1) {
			if(nombre % i == 0) {
				System.out.println(i + " est un diviseur de " + nombre);	
			}
		}
		
		sc.close();		
		
		// FIN PROGRAMM
		
	}

}
