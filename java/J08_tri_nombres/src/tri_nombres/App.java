package tri_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		System.out.println("Saisir A");
		a = sc.nextInt();
		System.out.println("Saisir B");
		b = sc.nextInt();
		
		if(a < b) {			
			System.out.println(a + ", " + b);
		}
		else 
		{
			System.out.println(b + ", " + a);
		}
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
