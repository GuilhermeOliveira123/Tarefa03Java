package exercicio03tarefaflamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8) Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel 
		que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual Tempo Gasto Na Viagem Em Horas? ");
		double TempoGastoViagem = sc.nextDouble();
		System.out.println("Qual A Velocidade Media em KM/H? ");
		double VelocidadeMedia = sc.nextDouble();
		double Distancia = TempoGastoViagem * VelocidadeMedia;
		double LitrosUsados = (Distancia/12);
		System.out.println("Dist�ncia Percorrida �: " +Distancia+"KM");
		System.out.println("Quantida De Litros Utilizados �:  " +LitrosUsados);
		
		sc.close();	
		

	}

}
