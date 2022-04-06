package Arrays;


//Dev Théo

public class exercicio1Vetor {

	public static void main(String[] args) {
		
		
		int [] A = {1,0,5,-2,-5,7};
		int i,resultado;
		resultado = A[0]+A[1]+A[5];
		A[3]=100;
				
		for (i=0;i<6;i++)
		{
			
			System.out.println("\nValor do vetor: "+A[i]);
			
		}

		System.out.println("\nResultado "+resultado);
	}

}
