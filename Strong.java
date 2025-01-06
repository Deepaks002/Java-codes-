// WAJP to find Strong Number or not

import java.util.Scanner;
class Strong
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int temp = a, sum = 0, prod = 1;
		while (a>0)
		{
			int last = a%10;
			for (int i=1 ; i<=last ;i++)
			{
				prod=prod*i;
			}
			sum=sum+prod;
			prod=1;
			a=a/10;
		}
		if (temp==sum)
		{
			System.out.println("Strong Number");
		}
		else
			System.out.println("Not a Strong Number");
		
	}
}