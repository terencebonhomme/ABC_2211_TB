package tri_nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		// JEU DE TESTS
		
		System.out.println("test 1 : a = 2 et b = 4");
		System.out.println("test 2 : a = 3 et b = 3");
		System.out.println("test 3 : 5 = 3 et b = 1");
		System.out.println("test 4 : a = -2 et b = 1");
		System.out.println("test 5 : a = 0 et b = -4");
		System.out.println("test 6 : a = 0 et b = 0");
		System.out.println("test 7 : a = -3 et b = -3");
		System.out.println("");
		
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
