package comparaison_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : age = -1");
		System.out.println("test 2 : age = 0");
		System.out.println("test 3 : age = 10");
		System.out.println("test 4 : age = 18");
		System.out.println("test 5 : age = 30");
		System.out.println("");
			
		// DEBUT PROGRAMME
		
		System.out.println("Saisir votre âge");
		age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("Vous n'êtes pas encore né");
		} 
		else if(age < 18) {
			System.out.println("Vous êtes mineur");
		} 
		else {
			System.out.println("Vous êtes majeur");
		}
	
		sc.close();
		
		// FIN PROGRAMME
	}

}
