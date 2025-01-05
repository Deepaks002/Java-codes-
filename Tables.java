// WAJP to print Tables of given number.
class Tables
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++)
		{
			System.out.println(i + " x " + a + " = " + (i*a));
		}
		
	}
}
