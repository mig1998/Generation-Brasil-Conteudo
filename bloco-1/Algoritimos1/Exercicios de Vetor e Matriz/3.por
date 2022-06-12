programa
{
	inclua biblioteca Util/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],m1[4][6],m2[4][6],somaPosicao=0

		//n1
		para(inteiro i=0;i<4;i++){
		
			para(inteiro j=0;j<6;j++){
		
				n1[i][j]=Util.sorteia(-100,100)
				n2[i][j]=Util.sorteia(-100,100)
				
				m1[i][j]=n1[i][j]+n2[i][j]
				m2[i][j]=n1[i][j]-n2[i][j]
			
			}
		}
		///-------Imprimindo textos----------///////////////////

	//imprimindo resultado n1
	escreva("\nResultado do n1\n")
		para(inteiro i=0;i<4;i++){
						
			para(inteiro j=0;j<6;j++){
			
				escreva("{",n1[i][j],"}")
					Util.aguarde(100)
				}
				
				escreva("\n")
			}
			
		//imprimindo resultado n2
		escreva("\nResultado do n2\n")
		para(inteiro i=0;i<4;i++){
						
			para(inteiro j=0;j<6;j++){
			
				escreva("{",n2[i][j],"}")
					Util.aguarde(100)
				}
				
				escreva("\n")
			}
	
	
		//imprimindo resultado m1
		escreva("\nResultado do m1\n")
		para(inteiro i=0;i<4;i++){
						
			para(inteiro j=0;j<6;j++){
			
				escreva("{",m1[i][j],"}")
					Util.aguarde(100)
				}
				
				escreva("\n")
			}
	
			//imprimindo resultado m2
		escreva("\nResultado do m2\n")
		para(inteiro i=0;i<4;i++){
						
			para(inteiro j=0;j<6;j++){
			
				escreva("{",m2[i][j],"}")
					Util.aguarde(100)
				}
				
				escreva("\n")
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */