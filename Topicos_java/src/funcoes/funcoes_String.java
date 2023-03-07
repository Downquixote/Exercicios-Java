package funcoes;

public class funcoes_String {

	public static void main(String[] args) {
		
		String original01 = "LUCAS BRANDÃO";
		String original02 = "thays kamila";
		String original03 = "Marianna Brandão Nogueira      ";
		String original04 = "Amelie Brandão Nogueira";
		String original05 = "Elizangela Vasconcelos";
		String original06 = "Bianca Sogabe";
		String original07 = "Melissa Raquel Vasconcelos";
		
		String s01 = original01.toLowerCase();
		String s02 = original02.toUpperCase();
		String s03 = original03.trim();
		String s04 = original04.substring(2);
		String s05 = original05.substring(4, 16);		
		String s06 = original06.replace('a', 'x');
		int i = original07.indexOf("l");
		int j = original07.lastIndexOf("l");
		
		System.out.println("Original: " + original01 + "\n");
		System.out.println("toLowerCase: " + s01 + "\n");
		
		// toLowerCase é utilizado para deixar os caracteres minúsculos. 
		
		System.out.println("Original: " + original02 + "\n");
		System.out.println("toUpperCase: " + s02 + "\n");
	
		// toUpperCasse é utilizado para deixar os caracteres maiúsculos.
		
		System.out.println("Original: " + original03 + "- \n");
		System.out.println("trim: " + s03 + "- \n");
		
		// trim elimina os espaços nos cantos das String's

		System.out.println("Original: " + original04 + "\n");
		System.out.println("substring: " + s04 + "\n");
		
		// substring começa a imprimir apartir do valor inicial declarado no parâmetro da String.
		
		System.out.println("Original: " + original05 + "\n");
		System.out.println("substring 'begin e end': " + s05 + "\n");
		
		// substring começa a imprimir apartir do valor inicial declarado e termina no segundo valor declarado no parâmetro da String.
	
		System.out.println("Original: " + original06 + "\n");
		System.out.println("replace: " + s06 + "\n");
		
		// replace é utilizado para trocar os caracteres da String.
		
		System.out.println("Original: " + original07 + "\n");
		System.out.println("IndexOf 'e': " + i + "\n");
		System.out.println("lastIndexOf 'e': " + j + "\n");
		
		// indexOf é utilizado para encontrar o primeiro caracter declarado no parâmetro da String.
		
		// lastIndexOf é utilizado para encontrar o último caracter declarado no parâmetro da String.
		
		
	
	
	
	}

}
