package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, 
		utilizando a f�rmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor Da Presta��o: ");
		float ValorDaPrestacao = sc.nextFloat();
		System.out.println("Digite O Valor Da Taxa De Atraso em %: ");
		float ValorDaTaxa = sc.nextFloat();
		System.out.println("Digite O Tempo de Atraso Em Dias: ");
		int TempoDeAtraso = sc.nextInt();
		float Prestacao = (ValorDaPrestacao + (ValorDaPrestacao * ValorDaTaxa / 100) * TempoDeAtraso);
		System.out.println("O Valor Da Presta��o �: "+Prestacao+ "R$");
		
		sc.close();


	}

}
