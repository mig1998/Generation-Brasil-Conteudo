programa
{
	inclua biblioteca Matematica-->math
	
/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
	funcao inicio()
	{
	 inteiro num1,num2,num3,num4


		escreva("Primeiro Numero:\n")
		leia(num1)
		escreva("Segundo Numero:\n")
		leia(num2)
		escreva("Terceiro Numero:\n")
		leia(num3)
		escreva("Quarto Numero:\n")
		leia(num4)


//calculos quadrados
		num1*=num1
		num2*=num2
		num3*=num3
		num4*=num4

		limpa()
	se(num3>=1000){
		escreva("o valor obtido do terceiro numero: \n",num3)
		
	}senao{

	escreva("\n",math.raiz(num1,2)," ao quadrado:",num1)	
	escreva("\n",math.raiz(num2,2)," ao quadrado:",num2)
	escreva("\n",math.raiz(num3,2)," ao quadrado:",num3)
	escreva("\n",math.raiz(num4,2)," ao quadrado:",num4)
	

	
	}
	 
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 902; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */