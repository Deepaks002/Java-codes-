// WAJP to find whether the givn number is Perfect Square or not	

import java.util.Scanner;
class Perfect_square
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your value : ");
		int a = sc.nextInt();
		String ans = "No";
		
		for (int i=1 ;i*i<=a ;i++)
		{
			if (i*i==a)
			{
				ans = "Yes";
				break;
			}
		}
			System.out.println(ans);
	}
}