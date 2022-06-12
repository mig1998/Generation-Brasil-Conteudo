package br.com.generation.listaexercicios;

import java.util.Scanner;

//7.Um sistema de equações lineares do tipo:
//ax+by=c
//dx+ey=f
//
//, pode ser resolvido segundo mostrado abaixo :
//x=ce-bf  y=af-cd
//  ae-bd	   ae-bd
// 
//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
//valores de x e y.

public class exercicio7 {

	public static void main(String[] args) {
		
		
		double a,b,c,d,e,f,x,y;
		
		Scanner dados=new Scanner(System.in);
		
		System.out.println("digite o coeficente A:"); 
		a=dados.nextDouble();
		System.out.println("digite o coeficente B:"); 
		b=dados.nextDouble();
		System.out.println("digite o coeficente C:"); 
		c=dados.nextDouble();
		System.out.println("digite o coeficente D:"); 
		d=dados.nextDouble();
		System.out.println("digite o coeficente E:"); 
		e=dados.nextDouble();
		System.out.println("digite o coeficente F:"); 
		f=dados.nextDouble();
		
		x=((c*e)-(b*f)/(a*e)-(b*d));
		
		y=((a*f)-(c*d)/(a*e)-(b*d));

		System.out.printf("valor de X: %.2f",x);
		System.out.printf(" valor de Y: %.2f",y);
		
		dados.close();
		
	}

}
