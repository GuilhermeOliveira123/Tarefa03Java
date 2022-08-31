package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, 
		utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor Da Prestação: ");
		float ValorDaPrestacao = sc.nextFloat();
		System.out.println("Digite O Valor Da Taxa De Atraso em %: ");
		float ValorDaTaxa = sc.nextFloat();
		System.out.println("Digite O Tempo de Atraso Em Dias: ");
		int TempoDeAtraso = sc.nextInt();
		float Prestacao = (ValorDaPrestacao + (ValorDaPrestacao * ValorDaTaxa / 100) * TempoDeAtraso);
		System.out.println("O Valor Da Prestação É: "+Prestacao+ "R$");
		
		sc.close();


	}

}
