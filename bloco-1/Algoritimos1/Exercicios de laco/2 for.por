programa
{
/*- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
 múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/
	
	funcao inicio()
	{

	real soma=0
	inteiro num



		
		
		para(inteiro i=0;i<=500;i++){
		escreva("\nsome numeros multiplos de multiplo de 3:\n")
		leia(num)
		
		se(num%3==0){
		soma+=num	
		}senao{
		escreva("\n não e multiplo de 3!\n")
		}
		
		
			escreva("\nresultado: \n",soma)
		}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */