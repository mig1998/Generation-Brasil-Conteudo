programa
{
/*1- Elaborar um programa que efetue a leitura sucessiva 
 de valores numéricos e apresente no final o total do somatório,
 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário
estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
	
	funcao inicio()
	{
		real soma=0,valor=0
		inteiro i=0

		enquanto(valor>=0){
	
			escreva("\nverificando se numero é positivo: \n")
			leia(valor)
	
			soma+=valor
			
			i++

			
		
		}

	escreva("\nsoma dos valores digitados: \n",soma)

	escreva("\nvalores digitados validos: \n",i-1)

	escreva ("\n media dos valores:",soma/(i-1))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */