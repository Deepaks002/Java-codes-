// Printing 1 to N without using Recursion

import java.util.Scanner;
class Recursion
{
	static int start=1;
	static int n;
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the N value : ");
		n=sc.nextInt();
		m1();
		
	}
	public static void m1()
	{
		if (start<=n)
		{
			System.out.println(start);
			start++;
			m1();
		}
		return;
	}
}


/* Printing N to 1 without using Recursion

import java.util.Scanner;
class Recursion
{
	static int end=10;
	static int n;
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the N value : ");
		n=sc.nextInt();
		m1();
		
	}
	public static void m1()
	{
		if (end>=n)
		{
			System.out.println(end);
			end--;
			m1();
		}
		return;
	}
}

*/