package barnabe_courses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int s;
		int magasin;
		int init_s;
		
		magasin = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		// JEU DE TESTS
		
		System.out.println("test 1 : somme = 0");
		System.out.println("test 2 : somme = 1");
		System.out.println("test 3 : somme = 2");
		System.out.println("test 4 : somme = 3");
		System.out.println("test 5 : somme = 4");
		System.out.println("test 6 : somme = 100");
		System.out.println("");
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir une somme");
		s = sc.nextInt();
		init_s = s;
		
		while(s > 0) {
			if(s > 2) {
				System.out.println(s + " - " + (s/2 + 1) + " = " + (s - (s/2 + 1)) + " car " + (s/2 + 1) + " < " + s + " donc " + (magasin + 1) + " magasin(s)");  
				s = s - (s/2 + 1);				
			}else {
				System.out.println(s + " - " + s + " = " + 0 + " car " + (s/2 + 1) + " = " + s + " donc " + (magasin + 1) + " magasin(s)");  
				s = 0;
			}						
				
			magasin++;
		}
		
		System.out.println("Barnabe a depense la somme dans " + magasin + " magasin(s)");
		
		// FIN PROGRAMME
	}

}
