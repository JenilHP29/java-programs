/*
	Matrix Multiplication
*/
import java.util.*;
class MatrixMul
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Matrix ");
		System.out.println("Number of rows: ");
		int noRows=sc.nextInt();
		System.out.println("Number of columns: ");
		int noCol=sc.nextInt();
		//Initializing Matrix
		int mat1[][]=new int[noRows][noCol];
		int mat2[][]=new int[noCol][noRows];
		//Initializing Matrix 1
		System.out.print("Enter Values in Matrix 1: ");
		for(int i=0;i<noRows;i++)
		{
			for(int j=0;j<noCol;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		//Initializing Matrix 2
		System.out.print("Enter Values in Matrix 2: ");
		for(int i=0;i<noCol;i++)
		{
			for(int j=0;j<noRows;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		//Multiplying Two Matrix
		int ans[][]=new int[noRows][noRows];
		for(int i =0;i<noRows;i++)
		{
			for(int j=0;j<noRows;j++)
			{
				ans[i][j]=0;
				for(int k=0;k<noCol;k++)
				{
					ans[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		//Print Product
		for(int i[]:ans)
		{
			for(int j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}