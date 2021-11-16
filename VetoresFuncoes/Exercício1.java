//Faça um programa onde o usuário entre com 4 notas num vetor chamado média, e o programa mostre a média.

package VetoresFuncoes;

import java.util.Scanner;

public class Exercício1 {
	
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
		System.out.println("A média é: "+ calc);
	}
}
