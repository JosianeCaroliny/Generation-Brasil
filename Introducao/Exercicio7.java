//Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.

package Introducao;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		float a,b,c,d,e,f,x,y;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite os valores de A, B, C, D, E e F: ");
		
		a=calc.nextFloat();
		b=calc.nextFloat();
		c=calc.nextFloat();
		d=calc.nextFloat();
		e=calc.nextFloat();
		f=calc.nextFloat();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.println(x);
		System.out.println(y);
	}

}
