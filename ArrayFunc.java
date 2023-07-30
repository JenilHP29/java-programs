/*
	Program For Array Function
	- Size of array
	- Max and Min Element in array
	- Average of All Elements of Array
	- Sorting Of Array 
*/
import java.util.*;
class Functions
{
	int arr[];
	Functions()
	{
		arr = new int[0];
	}
	
	Functions(int arr[])
	{
		this.arr = arr;
	}
	void getArray()
	{
		System.out.print("Array : ");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	void arrLength()
	{
		System.out.println("\nArray Length: "+arr.length);
	}
	void sortedArray()
	{
		Arrays.sort(arr);
		System.out.print("Sorted Array : ");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	void greatestElement()
	{
		int i = arr.length - 1;
		System.out.println("\nGreatest Element In Array: "+ arr[i]);
	}
	void leastElement()
	{
		System.out.println("Least Element In Array: "+ arr[0]);
	}
	void avgArray()
	{
		int sum = 0;
		float avg;
		for(int i:arr)
		{
			sum += i;
		}
		avg = (float)sum/arr.length;
		System.out.println("Average Of All Elements in Array: "+ avg);
	}
}
class ArrayFunc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Array : ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter Elements in Array : ");
		for(int i=0; i<len ; i++)
		{
			arr[i] = sc.nextInt();
		}
		Functions fc = new Functions(arr);
		fc.getArray();
		fc.arrLength();
		fc.sortedArray();
		fc.greatestElement();
		fc.leastElement();
		fc.avgArray();
	}
}