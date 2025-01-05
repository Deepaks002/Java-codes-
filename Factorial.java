// WAJP to print FACTORIAL of given number
class Factorial
{
	static Scanner sc = new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int fact = 1;
		
		for (int i=1 ; i<=a ;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+ a + " is : "  +fact);
	}
}
