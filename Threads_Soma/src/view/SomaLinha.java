package view;
import controller.SomaLinhaController;

public class SomaLinha 
{
	public static void main(String[] args) 
	{
	int[][]matriz = new int [3][5];
	 int[]l1 = new int [5];
	 int[]l2 = new int [5];
	 int[]l3 = new int [5];
	 
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			matriz[i][j] = (int) ((Math.random() * 100) + 1);
		}	
	}

	
	for (int i = 0; i < 5; i++)
	{	
	l1[i] = l1[i] + matriz[0][i];
	l2[i] = l2[i] + matriz[1][i];
	l3[i] = l3[i] + matriz[2][i];	
	}
	
	
	Thread t = new SomaLinhaController(l1, l2, l3);
	t.start();

	}

}
