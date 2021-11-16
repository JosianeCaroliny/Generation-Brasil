/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package LacoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		int x;
		System.out.println("Digite sua idade: ");
		x=ler.nextInt();
		ler.nextLine();
		
		if(x==10 || x==11 || x==12 || x==13 || x==14)
		{
			System.out.print("Categoria Infantil");
		}
		else if(x==15 || x==16 || x==17)
		{
			System.out.print("Categoria Juvenil");
		}
		else if(x==18 || x==19 || x==20 || x==21 ||x==22 || x==23 || x==24 || x==25)
		{
			System.out.print("Categoria Adulto");
		}
		else 
		{
			System.out.print("Você não se encaixa em nenhuma categoria!");
		}
	}
}
