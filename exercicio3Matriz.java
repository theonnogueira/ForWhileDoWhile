package Arrays;

public class exercicio3Matriz {
	
	//int matriz[4][4], contagem = 0;
	float[][] matriz1 = new float [2][2];
	float[][] matriz2 = new float [2][2];
	int linha,coluna;
	
	
  
    for(linha=0; linha<4; linha++)
    {
        for(coluna=0;coluna<4;coluna++)
        {
            System.out.println(coluna+1);
            Object[][] matriz;
			
            
        }
    }
   
     //contagem > 10
    for(linha=0; linha<4; linha++)
        for(coluna=0; coluna<4; coluna++)
            if(matriz[linha][coluna] > 10)
                contagem++;
 
 
    System.out.println("\n\n Existem na matriz %d números maiores que 10.", contagem);
   
    return 0;
}
}