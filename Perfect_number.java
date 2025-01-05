// WAJP to check if the given number is "Perfect Number" or not

class Perfect_number
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int original = a;
		int sum=0;
		
		for (int i=1 ; i<=a/2 ;i++)
		{
			if (a%i==0)
			{
				sum = sum + i;
			}
		}
			if (sum==original)
			{
				System.out.println(a +" is a perfect Number");
			}
			else
			{
				System.out.println(a+" is not a perfect Number");
			}
	}
}