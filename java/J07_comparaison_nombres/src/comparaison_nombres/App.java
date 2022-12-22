package comparaison_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int age;
		Scanner sc = new Scanner(System.in);
		
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
