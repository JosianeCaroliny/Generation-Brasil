//Faça um programa que receba três inteiros e diga qual deles é o maior.

package LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Digite 3 numeros: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("O primeiro número é o maior");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("O segundo número é o maior");
		}
		else
		{
			System.out.println("O terceiro é o maior");
		}
	}
	
}
