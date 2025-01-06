// WAJP to find Spy Number or not

import java.util.Scanner;
class Spynumber
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int temp = a, sum = 0, prod = 1;
		while (a>0)
		{
			sum=sum+a%10;
			prod=prod*a%10	;
			a=a/10;
		}
		if (sum==prod)
		{
			System.out.println("Spy Number");
		}
		else
			System.out.println("Not a Spy Number");
		
	}
}