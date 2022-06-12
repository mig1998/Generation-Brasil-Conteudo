programa
{
/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/
	
	funcao inicio()
	{
	inteiro C
	real N,E

		escreva("Qual o Codigo do trabalhor?\n")
		leia(C)
		escreva("Quantas horas ele trabalhou?\n")
		leia(N)

		se(N>50){
			E=N-50
			
			escreva("O trabalhador do codigo ",C, " recebe R$10,00 por hora tbrabalhada então são:\nR$:",50*10," \no salario excedente é de: \nR$:",E*20,"\n entao o salario dele total é de :\nR$:",(50*10)+E*20)
			
			
			}senao{
			E=0
				escreva("o trabalhador do codigo ",C," não recebe horas extras")
				
			}
	
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 837; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */