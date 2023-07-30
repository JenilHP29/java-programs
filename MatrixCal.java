import java.util.*;
class MatrixCal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows,cols;
		System.out.println("Enter Size of Matrix ");
		System.out.print("Number of Rows: ");
		rows = sc.nextInt();
		System.out.print("Number of Columns: ");
		cols = sc.nextInt();
		
		DataHandle dh = new DataHandle();
		System.out.println("Enter Value in Matrix A ");
		int mat1[][]=dh.setData(rows,cols);
		dh.getData(mat1);
		System.out.println("Enter Value in Matrix B ");
		int mat2[][]=dh.setData(rows,cols);
		dh.getData(mat2);
		
		Operation op=new Operation();
		int ch=0;
		do
		{
			System.out.println("\nChoose From Following\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Exit");
			System.out.print("Enter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					op.add(mat1,mat2);
				break;
				case 2:
					op.sub(mat1,mat2);
				break;
				case 3:
					op.mul(mat1,mat2);
				break;
				case 4:
				break;
				default:
					System.out.println("Invalid Choice");
			}
		}while(ch!=4);
	}
}
class DataHandle
{
	Scanner sc=new Scanner(System.in);
	int[][] setData(int r,int c)
	{
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	void getData(int arr[][])
	{
		System.out.println("Matrix");
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
class Operation
{
	void add(int m1[][],int m2[][])
	{
		int Row=m1.length;
		int Col=m1[0].length;
		int result[][]=new int[Row][Col];
		System.out.println("\nAddition A+B");
		for(int i=0;i<Row;i++)
		{
			for(int j=0;j<Col;j++)
			{
				result[i][j]=m1[i][j]+m2[i][j];
			}
		}
		for(int a[]:result)
		{
			for(int b:a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
	
	void sub(int m1[][],int m2[][])
	{
		int Row=m1.length;
		int Col=m1[0].length;
		int result[][]=new int[Row][Col];
		System.out.println("\nSubtraction A-B");
		for(int i=0;i<Row;i++)
		{
			for(int j=0;j<Col;j++)
			{
				result[i][j]=m1[i][j]-m2[i][j];
			}
		}
		for(int a[]:result)
		{
			for(int b:a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
	
	void mul(int m1[][],int m2[][])
	{
		int m1Row=m1.length;
		int m1Col=m1[0].length;
		int m2Row=m2.length;
		int m2Col=m2[0].length;
		if(m1Col==m2Row)
		{
			int ans[][]=new int[m1Row][m2Col];
			System.out.println("\nMultiplication A*B");
			for(int i =0;i<m1Row;i++)
			{
				for(int j=0;j<m2Col;j++)
				{
					ans[i][j]=0;
					for(int k=0;k<m2Col;k++)
					{
						ans[i][j]+=m1[i][k]*m2[k][j];
					}
				}
			}
		
			for(int a[]:ans)
			{
				for(int b:a)
				{
					System.out.print(b + " ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Cannot Do Multiplication");
		}
	}
}