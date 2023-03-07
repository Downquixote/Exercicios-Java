package funcoes;

public class Split {

	public static void main(String[] args) {
	
		String a = "luffy zoro sanji";
		
		String[] mugiwara = a.split(" ");
		String word1 = mugiwara[0];
		String word2 = mugiwara[1];
		
		System.out.println(word1);
		System.out.println(mugiwara[2]);
		System.out.println(mugiwara[1]);
		
		/* Split é utilizado para recortar o valor da variável e guardar o resultado em um Vetor
		
		pode-se tanto usar a variável "word" quanto a "mugiwara" para imprimir o valor, ou nenhuma delas. */
		
	}

}
