/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

package LacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
public static void main(String args[])
	{
		Scanner ler=new Scanner (System.in);
		int x;
		System.out.println("Digite um número: ");
		x=ler.nextInt();
		double raiz = Math.sqrt(x);
		
		if(x%2==0)
		{
			System.out.printf("Este número é par e sua raiz quadrada é %2f", raiz);
		}
		else
		{
			System.out.printf("Este número é impar e quando elevado ao quadrado é %d", (x*x));
		}
	}
}
