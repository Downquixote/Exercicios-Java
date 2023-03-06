package Do_while;

import java.util.Locale;
import java.util.Scanner;

public class Dev_do_while {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		char resp = 'S';
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = entrada.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.println("Deseja repetir? (S/N)");
			resp = entrada.next().charAt(0);
		}while(resp != 'N');
		
		System.out.println("Programa Finalizado!");
		
		entrada.close();
	}

}
