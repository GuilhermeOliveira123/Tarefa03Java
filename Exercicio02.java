package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
		 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
		 */
	      Scanner sc = new Scanner(System.in);

	      int eleitores, brancos, nulos, validos;
	      double percBrancos, percNulos, percValidos;

	      System.out.printf("Informe o nro de eleitores:\n");
	      eleitores = sc.nextInt();
	                      
	      System.out.printf("Informe o nro de votos validos:\n");
	      validos = sc.nextInt();
	      
	      System.out.printf("Informe o nro de votos em branco:\n");
	      brancos = sc.nextInt();
	      
	      System.out.printf("Informe o nro de votos nulos:\n");
	      nulos = sc.nextInt();

	      percValidos = ((double)validos / eleitores) * 100;
	      percBrancos = ((double)brancos / eleitores) * 100;
	      percNulos = ((double)nulos / eleitores) * 100;

	      System.out.printf("percentual de votos validos.", percValidos);
	      System.out.printf("percentual de votos em branco.", percBrancos);
	      System.out.printf("percentual de votos nulos.", percNulos);
	      sc.close();
	    }

}

