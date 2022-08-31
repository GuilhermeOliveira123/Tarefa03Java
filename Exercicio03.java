package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
		 * Calcular e escrever o valor do novo salário.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mensal atual:");
		float salario=sc.nextFloat();
		System.out.println("Digite o percentual do reajuste: ");
		float percentualReajuste=sc.nextFloat();
		float novoSalario=salario/100*percentualReajuste+salario;
		System.out.println("O novo salário corresponde a :"+novoSalario);
		
		sc.close();

	}

}
