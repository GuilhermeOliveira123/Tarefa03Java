package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3) Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. 
		 * Calcular e escrever o valor do novo sal�rio.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio mensal atual:");
		float salario=sc.nextFloat();
		System.out.println("Digite o percentual do reajuste: ");
		float percentualReajuste=sc.nextFloat();
		float novoSalario=salario/100*percentualReajuste+salario;
		System.out.println("O novo sal�rio corresponde a :"+novoSalario);
		
		sc.close();

	}

}
