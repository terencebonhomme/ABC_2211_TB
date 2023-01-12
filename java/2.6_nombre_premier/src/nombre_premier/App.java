package nombre_premier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int nombre;
		int i;
		boolean premier = true;
		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : 0");
		System.out.println("test 2 : 1");
		System.out.println("test 3 : 2");
		System.out.println("test 4 : 17");
		System.out.println("test 5 : 47");
		System.out.println("test 6 : 50");
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		/*
		 * nombre est premier jusqu'a preuve du contraire
		 * 
		 * on exclut 1 et nombre de la boucle
		 * 
		 * la boucle s'arrête dès qu'un diviseur est trouvé
		 */
		
		for(i = 2; i <= nombre - 1 && premier; i++) {
			if(nombre % i == 0) {
				premier = false;
			}
		}
		
		if(premier) {
			System.out.println(nombre + " est un nombre premier");
		}else {
			System.out.println(nombre + " n'est pas un nombre premier");
		}
		
		sc.close();		
		
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		System.out.println("");
		if(nombre == 0) System.out.println("test 1 : " + (premier == false));
		if(nombre == 1) System.out.println("test 2 : " + (premier == false));
		if(nombre == 2) System.out.println("test 3 : " + (premier == true));
		if(nombre == 17) System.out.println("test 4 : " + (premier == true));
		if(nombre == 47) System.out.println("test 5 : " + (premier == true));
		if(nombre == 50) System.out.println("test 6 : " + (premier == false));
		
		// FIN TESTS				
	}

}