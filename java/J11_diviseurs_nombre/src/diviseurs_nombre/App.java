package diviseurs_nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
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
