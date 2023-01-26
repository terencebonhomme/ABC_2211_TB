package max_tableaumax;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		
		int[] nombres = new int[] {1, 2, 9, 4};
		
		// PROGRAMME
		
		System.out.println(maximum(nombres));
		
		// FIN PROGRAMME
	}
	
	public static int maximum(int[] nombres) {
		
		// VARIABLES
		
		int max = -1;
		
		// PROGRAMME
		
		for(int i = 0; i < nombres.length; i++) {
			if(nombres[i] > max) {
				max = nombres[i];
			}
		}
		
		return max;
		
		// FIN PROGRAMME
	}

}
