package nombre_tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int[] tabEntier = new int[] {2, 4, 4, 6, 8};	
		boolean yFigure = false;
		int nombre;
		int indice;
		
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : 4");
		System.out.println("test 2 : 6");
		
		// DEBUT PROGRAMME
		
		nombre = sc.nextInt();
		
		for(indice = 0; indice < tabEntier.length && !yFigure; indice++) {
			if(tabEntier[indice] == nombre) {
				yFigure = true;
			}
		}
		
		indice--;
		
		if(yFigure) {
			System.out.println(indice);
		}else {
			System.out.println("404 Not found");
		}
		
		sc.close();
		
		// FIN PROGRAMME
		
		// DEBUT TESTS
		
		if(nombre == 4) System.out.println(indice == 1);
		if(nombre == 6) System.out.println(indice == 3);
		
		// FIN TESTS
	}

}
