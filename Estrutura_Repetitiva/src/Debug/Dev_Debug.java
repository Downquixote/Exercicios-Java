package Debug;

import java.util.Locale;
import java.util.Scanner;

public class Dev_Debug {

	public static void main(String[] args) {
		
		// Selecione a linha para aplicar o Debug
		// Clique em Run > Toggle Breakpoint > execute o programa
		// Clique F6 para analisar onde está o erro
	
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("[LUA REVESTIMENTOS]\n");
		System.out.println("OLÁ, DIGITE ABAIXO OS VALORES QUE SE ADEQUAM AS SUAS NECESSIDADES: \n");
		
		System.out.print("Largura: ");
		double largura = entrada.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = entrada.nextDouble();
		
		System.out.print("Metros Quadrados: ");
		double metrosQuadrados = entrada.nextDouble();
		
		double area = largura + comprimento;
		double preco = area + metrosQuadrados;
		
		System.out.printf("ÁREA: %.2f\n", area);
		System.out.printf("PREÇO: %.2f\n", preco);
		
		System.out.println("PROGRAMA FINALIZADO");

		entrada.close();
	}

}
