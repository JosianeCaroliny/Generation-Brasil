/* Fa�a um programa onde o usu�rio entre com 4 notas e o programa calcule a m�dia.
 Obs.: utilize uma fun��o para mostrar a m�dia no console*/

package VetoresFuncoes;

import java.util.Scanner;

public class Exerc�cio3 {
	
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
		System.out.println("A m�dia �: "+ valor);
	}		
		
}
