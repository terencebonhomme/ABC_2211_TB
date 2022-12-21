package inversion_deux_valeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		// DEBUT PROGRAMME
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
		
		// FIN PROGRAMME
	}

}
