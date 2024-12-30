import java.util.Scanner;
class Demo
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter value 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter value 2 : ");
		int b = sc.nextInt();
		System.out.print("Enter value 3 : ");
		int c = sc.nextInt();
		
		if (a>b && a>c)
		{
			if (b>c)
			{
				System.out.println("B is second Largest : "+b);
			}
			else
				System.out.println("C is second Largest : "+c);
			else-if (b>c)
			{
				if (a>c)
				{
					System.out.println("A is second Largest : "+a);
				}
				else
					System.out.println("C is second Largest : "+c);
				
				else-if (a>b)
				{
					System.out.println("A is second Largest : "+a);
				}
				else
					System.out.println("B is second Largest : "+b);
			}
		}
	}
}