//Faça um programa que entre com três números e coloque em ordem crescente.

package LacoCondicional;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		int num1, num2, num3;
		System.out.println("Digite um número: ");
		num1=ler.nextInt();
		System.out.println("Digite mais um número: ");
		num2=ler.nextInt();
		System.out.println("Digite o terceiro e último número: ");
		num3=ler.nextInt();

		if(num1 <= num2 && num2 <= num3)
		{
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
		else if(num1 <= num3 && num3 <= num2)
		{
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}
		else if(num2 <= num1 && num1 <= num3)
		{
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}
		else if (num2 <= num3 && num3 <= num1) 
	    {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
	    }
		else if (num3 <= num1 && num1 <= num2) 
		{
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
	}
}