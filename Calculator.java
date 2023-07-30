/**/
import java.util.*;
class ArithmeticOp
{
	void add(int a, int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	void subtract(int a, int b)
	{
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
	}
	void mul(int a, int b)
	{
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	void div(int a, int b)
	{
		System.out.println("Quotient of "+a+" and "+b+" is "+(a/b));
		System.out.println("Remainder of "+a+" and "+b+" is "+(a%b));
	}
}

class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArithmeticOp ap= new ArithmeticOp();
		System.out.print("Enter Two Values: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ch=0;
		do
		{
			System.out.println("\nChoose From The Following: \n1.Additon\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.print("Enter Your Choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					ap.add(num1,num2);
				break;
				case 2:
					ap.subtract(num1,num2);
				break;
				case 3:
					ap.mul(num1,num2);
				break;
				case 4:
					ap.div(num1,num2);
				break;
				case 5:
				break;
				default:
					System.out.println("Invalid choice!!");
			}
		}while(ch!=5);
	}
}