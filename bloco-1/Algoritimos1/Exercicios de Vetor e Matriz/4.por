programa
{
	inclua biblioteca Util
/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		real valor[3][3],soma=0,diagonal=0
		inteiro i,j


		para(i=0;i<3;i++){
			
			para(j=0;j<3;j++){

			escreva("escreva valores:")
			leia(valor[i][j])
			limpa()
			
			soma+=valor[i][j]
			}
			
		}
	
		escreva("soma de todos os numeros: ",soma,"\n")



//imprimindo na tela
		para(i=0;i<3;i++){
			
			para(j=0;j<3;j++){

			escreva("{",valor[i][j],"}")
			Util.aguarde(400)
			}
			escreva("\n")
		}


		escreva("soma da primeira diagonal:",valor[0][0]+valor[1][1]+valor[2][2])
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */