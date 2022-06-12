programa
{
	/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
	 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/
	funcao inicio()
	{

	real valor,soma=0
	inteiro num1=0

		escreva("Digite um numero:\n")
		leia(valor)

		faca{

			soma+=valor
		
			num1++
			
			se(num1==valor){
				escreva(num1,"=")
				
			}senao{
				escreva(num1,"+")	
			}

		
		}enquanto(num1<valor)
	
	escreva("\n",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */