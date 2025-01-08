import java.util.Scanner;
class Methods
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the value 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter the value 2 : ");
		int b = sc.nextInt();
		
		int large = largestoftwo(a,b);
		System.out.println("Largest of two number is : "+large);
		System.out.println("*********************************");
		
		int small = smallestoftwo(a,b);
		System.out.println("Smallest of two number is : "+small);
		System.out.println("*********************************");
		
		int sum = sumoftwo(a,b);
		System.out.println("Sum of two number is : "+sum);
		System.out.println("*********************************");
		
		int sub = suboftwo(a,b);
		System.out.println("Sub of two number is : "+sub);
		System.out.println("*********************************");
	}
	public static int largestoftwo(int a, int b)
	{
		if (a>b)
		{
			return a;
		}
		else
			return b;
	}
	public static int smallestoftwo(int a, int b)
	{
		if (a>b)
		{
			return b;
		}
		else
			return a;
	}
	public static int sumoftwo(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public static int suboftwo(int a, int b)
	{
		int c=a-b;
		return c;
	}
}
