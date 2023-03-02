package If_Else;

import java.util.Locale;
import java.util.Scanner;

public class Dev_If_Else {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = entrada.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		System.out.println("-------------------------");

		System.out.println("\n PLANO DE TELEFONE: \n");
		System.out.println("Lembre-se, o plano contratado é o 'plano básico' no valor de R$50,00 tendo benefício de 100 minutos.");
		System.out.println("Para cada minuto excedido o limite, será cobrado uma taxa de R$2,00.");
		System.out.println();

		Locale.setDefault(Locale.US);
		System.out.println("Quantos minutos você utilizou?");
		int minutos = entrada.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}

		System.out.printf("VALOR DA CONTA = R$%.2f\n", conta);

		entrada.close();

	}

}
