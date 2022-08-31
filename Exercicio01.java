package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa 
		 * pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
		 */
		
	    Scanner sc = new Scanner(System.in);
		int IdadeAnos , IdadeMeses, IdadeDias, IdadeTotalDias;
		
		System.out.print("Calculadora de idade em dias\n\n"); 

		System.out.print("Digite quantos você tem: ");
		IdadeAnos = sc.nextInt();
		
		System.out.print("Digite os meses: ");
		IdadeMeses = sc.nextInt();

		System.out.print("Digite os dias: ");
		IdadeDias = sc.nextInt();


		IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
		System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");
		
		sc.close();


	}

}
