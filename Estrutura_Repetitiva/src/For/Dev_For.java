package For;

import java.util.Scanner;

public class Dev_For {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos valores deseja somar?");
		int N = entrada.nextInt();
	
		System.out.println("digite os valores: ");
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = entrada.nextInt();
			soma = soma + x;
		}
		
		System.out.println("RESULTADO: " + soma);
		
		
		
		entrada.close();
	}

}
