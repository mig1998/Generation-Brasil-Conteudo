programa
{
/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
	
	funcao inicio()
	{
		real b,a

		escreva("escreva a base do triangulo:")
		leia(b)
		
		escreva("escreva a altura do triangulo:")
		leia(a)

	se(b>0 e a>0){
		
		escreva("area do triangulo: ",(a*b)/2)
		
		
	}senao{
		escreva("voce inseriu numeros invalidos")
	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */