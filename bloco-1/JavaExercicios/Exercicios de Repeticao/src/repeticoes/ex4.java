package repeticoes;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)
// o número de pessoas calmas;
// o número de mulheres nervosas;
// o número de homens agressivos;
// o número de outros calmos;
// o número de pessoas nervosas com mais de 40 anos;
// o número de pessoas calmas com menos de 18 anos.

public class ex4 {

	public static void main(String[] args) {
		
		int i=1,resposta,idade,sexo,pessoasCalmas=0,mulheresNevorsas=0,homensAgressivos=0,outrosCalmos=0,nervosos40=0,calmos18=0;

		
		
		
		Scanner sc=new Scanner(System.in);
				
		
				while(i<=150) {
					System.out.println("pessoa numero "+i);
					System.out.println("qual a sua idade: ");
					idade=sc.nextInt();
					
					System.out.println("qual o sexo 1-Feminino,2-Masculino,3-Outros?");
					sexo=sc.nextInt();
				
					System.out.println("voce é 1-Calmo,2-Nervoso,3-Agressivo?");
					resposta=sc.nextInt();
					
						if(resposta==1) {
							pessoasCalmas++;
						}
						
						if(resposta==2 && sexo==1) {
							mulheresNevorsas++;
						}
						
						if(resposta==3 && sexo==2) {
							homensAgressivos++;
						}
						
						
						if(resposta==1 && sexo==3) {
							outrosCalmos++;
						}
						
						if(resposta==2 && idade>40) {
							nervosos40++;
						}
						
						if(resposta==1 && idade<18) {
							calmos18++;
						}
						
						
						
					i++;
					
				}
				
				System.out.println("Total Pessoas Calmas: "+pessoasCalmas);
				System.out.println("Total de Mulheres nervosas: "+mulheresNevorsas);
				System.out.println("Total de homens Agressivos: "+homensAgressivos);
				System.out.println("Total de Outros(sexo) Calmes: "+outrosCalmos);
				System.out.println("Pessoas nervosas acima de 40: "+nervosos40);
				System.out.println("Pessoas Calmas com menos de 18: "+calmos18);
				sc.close();	
			}
				
				
	}


