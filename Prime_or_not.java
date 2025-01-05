//15). WAJP to check prime number or not 
class Prime_or_not
{
	static Scanner sc = new Scanner (System.in);
	public static void main (String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		boolean is_prime = true;
		if (a==0 || a==1)
		{
			System.out.println("Nither Prime Nor Composite");
		}
		for (int i=1 ;i<=a-1 ;i++)
		{
			if (a%i==0)
			{
				is_prime = false;
				break;
			}
			
		}
		if (is_prime)
		{
			System.out.println(a+" is a prime number");
		}
		else
			System.out.println(a+" is not a prime number");
	}
}