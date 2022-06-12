programa
{
/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
 (imprimindo o novo valor) até que ele seja maior do que 100.
Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.*/
	
	funcao inicio()
	{

	real valor=0


		escreva ("\nescreva um valor pra ser multiplicado por 3 até dar 100:\n")
		leia(valor)


	
		enquanto(valor<=100){
			
		valor*=3
		
		escreva ("\n",valor)
			
		}


	
		escreva("\nfim")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */