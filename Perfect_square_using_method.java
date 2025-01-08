import java.util.Scanner;
class Perfect_square_using_method 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		boolean res = m1(a);
		if (res)
		{
			System.out.println("perfect square");
		}
		else
			System.out.println("Not a perfect square");
	}
	public static boolean m1(int a)
	{
		for (int i=1 ;i*i<=a ;i++)
		{
			if (i*i==a)
			{
				return true;
			}
		}
		return false;
	}
}
