/* Faça um programa onde o usuário entre com 4 notas e o programa calcule a média.
 Obs.: utilize uma função para mostrar a média no console*/

package VetoresFuncoes;

import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String[] args) {
		float [] media = new float[4];
		float calc=0;
		int x;
		Scanner ler = new Scanner(System.in);
		for (x=0;x<4;x++)
		{
			System.out.print("Digite uma nota: ");
			media[x]=ler.nextFloat();
			calc+=media[x];
		}
		calc=calc/4;
		imprime(calc);
	
	}

	public static void imprime(float valor)
	{
		System.out.println("A média é: "+ valor);
	}		
		
}
