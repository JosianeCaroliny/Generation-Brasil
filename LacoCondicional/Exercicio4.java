/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/

package LacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
public static void main(String args[])
	{
		Scanner ler=new Scanner (System.in);
		int x;
		System.out.println("Digite um n�mero: ");
		x=ler.nextInt();
		double raiz = Math.sqrt(x);
		
		if(x%2==0)
		{
			System.out.printf("Este n�mero � par e sua raiz quadrada � %2f", raiz);
		}
		else
		{
			System.out.printf("Este n�mero � impar e quando elevado ao quadrado � %d", (x*x));
		}
	}
}
