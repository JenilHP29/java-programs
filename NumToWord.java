/*
	Program for Converting Numbers into Words
*/
import java.util.*;
class NumToWord
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int userInput;
		int i=0,n;
		int num[]=new int[5];
		String digits[]={""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"};
		String nty[]={"",""," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninty"};
		String tens[]={" Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
		StringBuffer sb = new StringBuffer("");
		System.out.print("Enter A Number (Max 5 Digits): ");
		userInput = sc.nextInt();
		n=userInput;
		if(userInput>99999)
		{
			System.out.println("Invalid number!!!");
			System.exit(0);
		}
		while(userInput>0)
		{
			num[i]=userInput%10;
			i++;
			userInput=userInput/10;
		}
		if(num[4]!= 0)
		{
			if (num[4]==1)
			{
				sb.append(tens[num[3]]);
				sb.append(" Thousand");
			}
			else
			{
				sb.append(nty[num[4]]);
				sb.append(digits[num[3]]);
				sb.append(" Thousand");
			}
		}
		else
		{
			if(num[3]!=0)
			{
				sb.append(digits[num[3]]);
				sb.append(" Thousand");
			}
		}
		if(num[2]!=0)
		{
			sb.append(digits[num[2]]);
			sb.append(" Hundred");
		}
		if(num[1]!=0)
		{
			if(num[1]==1)
			{
				sb.append(tens[num[0]]);
			}
			else
			{
				sb.append(nty[num[1]]);
				sb.append(digits[num[0]]);
			}
		}
		else
		{
			if(num[0]!=0)
			{
				sb.append(digits[num[0]]);
			}
			else
			{
				System.out.println("Zero");
			}
		}
		System.out.print(n+ ":"+sb);
	}
}