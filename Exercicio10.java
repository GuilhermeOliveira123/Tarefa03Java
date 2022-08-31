package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir 
		o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.*/
		
		int troca;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Primeiro Valor: ");
		int a = sc.nextInt();
		System.out.println("Digite O Segundo Valor: ");
		int b = sc.nextInt();
		troca = a;
		a = b;
		b = troca;
		System.out.println("O Valor De A É: "+a);
		System.out.println("O Valor de B É "+b);
		sc.close();

	}

}
