package repeticoes;


//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1000;i<=1999;i++) {
			
			if(i%11 == 5) {
				System.out.println("numero: "+i);
			}
			
		}

	}
}
