package controller;

public class SomaLinhaController extends Thread 
{
 private int[]l1;
 private int[]l2;
 private int[]l3;
 
 public SomaLinhaController(int[]l1,int[]l2, int[]l3)
 {
	this.l1 = l1;
	this.l2 = l2;
	this.l3 = l3;
 }
 
 public void run()
 {
	soma(); 
 }

 private void soma() 
 { 
	int[] x = new int[3];
	
	for(int i = 0; i < 3; i++)
	{
	 x[0] = x[0] + l1[i];
	 x[1] = x[1] + l2[i];
	 x[2] = x[2] + l3[i];
	 
	}
	
	System.out.println("Soma da Linha 1 = " + x[0]);
	System.out.println("Soma da Linha 2 = " + x[1]);
	System.out.println("Soma da Linha 3 = " + x[2]);
	
 }
}
