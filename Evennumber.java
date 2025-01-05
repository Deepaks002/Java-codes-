//WAJP to print only Even numbers.
class Even
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		
		for (int i=1 ;i<=a ;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}