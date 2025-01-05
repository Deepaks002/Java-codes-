// WAJP to perform X power N operation

import java.util.Scanner;
class X_power_n_operation
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the X value : ");
		int x = sc.nextInt();
		System.out.print("Enter the N value : ");
		int n = sc.nextInt();
		int prod = 1;
		
		for (int i=1 ; i<=n ;i++)
		{
			prod=prod*x;
		}
		System.out.println(prod);
	}
}