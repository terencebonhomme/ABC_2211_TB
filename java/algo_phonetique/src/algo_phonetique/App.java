package algo_phonetique;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// 1
		// 11
		// 21
		// 12 11
		// 11 12 21
		// 31 22 11

		// VARIABLES

		String suite = "1";
		String res = "";

		char chiffre;
		int compteur;
		int pas;

		boolean test = true;

		Scanner sc = new Scanner(System.in);

		// DEBUT PROGRAMME

		pas = sc.nextInt();

		for (int p = 0; p < pas; p++) {
			chiffre = suite.charAt(0);
			compteur = 0;
			res = "";

			for (int i = 0; i < suite.length(); i++) {
				if (suite.charAt(i) == chiffre) {
					compteur++;
				} else {
					res = res + compteur + chiffre;

					chiffre = suite.charAt(i);
					compteur = 1;
				}
			}

			res = res + compteur + chiffre;

			System.out.print(res);

			suite = res;

			// tests

			switch (p) {
			case 0:
				System.out.println(" " + res.equals("11"));
				if (test)
					test = res.equals("11");
				break;
			case 1:
				System.out.println(" " + res.equals("21"));
				if (test)
					test = res.equals("21");
				break;
			case 2:
				System.out.println(" " + res.equals("1211"));
				if (test)
					test = res.equals("1211");
				break;
			case 3:
				System.out.println(" " + res.equals("111221"));
				if (test)
					test = res.equals("111221");
				break;
			case 4:
				System.out.println(" " + res.equals("312211"));
				if (test)
					test = res.equals("312211");
				break;
			default:
				break;
			}
		}

		// FIN PROGRAMME

		System.out.println("\ntest : " + test);
	}
}
