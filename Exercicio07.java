package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio07 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura.*/
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite o Valor do Raio: ");
		float raio=sc.nextFloat();
			System.out.println("Digite O Valor da Altura");
		float altura=sc.nextFloat();
		double Volume;
		Volume=Math.PI*(raio*raio)*altura;
		
		System.out.println("O Valor Do Volume Da Lata De Óleo É: " + Volume);
		
		sc.close();
		

	}

}
