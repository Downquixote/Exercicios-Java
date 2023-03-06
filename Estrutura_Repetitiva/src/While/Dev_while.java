package While;

import java.util.Scanner;

public class Dev_while {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = entrada.nextInt();
		}
		
		System.out.println("RESULTADO DA SOMA: " + soma);
		
		System.out.println("\n ================================= \n");
		int senha = entrada.nextInt();
		
		while (senha != 2002) {
			System.out.println("SENHA INVÁLIDA!");
			senha = entrada.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		entrada.close();
	}

}
