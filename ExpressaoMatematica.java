package exercicios;

public class ExpressaoMatematica {
	
	public static void main(String[] args) {
		
		/* Resolvendo uma expressão matemática
		 * 
		 * ( [6*(3+2)]^2      ((1-5)*(2-7))^2)^3
		 * --------------  -  ---------------
		 * (     3*2          (     2     )  )
		 * -----------------------------------
		 *                10^3    
		 * 
		 */
		
		int a = 6 * (3+2);
		int b = (int) Math.pow(a, 2);
		int c = 3*2;
		
		int d = b/c;
						
		int e = ((1-5) * (2-7))/2;
		int f = (int) Math.pow(e, 2);
		
		int g = d - f;
		int h = (int) Math.pow(g, 3);
		
		int i = (int) Math.pow(10, 3);
		
		int j = h/i;
		
		System.out.println("O resultado da expressão é " + j);
		
		
	}

}
