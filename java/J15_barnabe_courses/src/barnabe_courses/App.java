package barnabe_courses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int s;
		int magasin;
		
		magasin = 0;
		
		Scanner sc = new Scanner(System.in);				
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir une somme");
		s = sc.nextInt();
		
		while(s > 0) {
			s = s - (s/2 + 1);	
			magasin++;
		}
		
		System.out.println("Barnabe a depense la somme dans " + magasin + " magasin(s)");
		
		// FIN PROGRAMME
	}

}
