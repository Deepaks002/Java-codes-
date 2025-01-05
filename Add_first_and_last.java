// WAJP to add first and last digit.
class Add_first_and_last
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the Value : ");
		int a = sc.nextInt();
		int last = a%10;
		
		while (a>9)
		{
			a/=10; //a=a/10
		}
		int sum = last+a;
		System.out.println("Sum of first and last digit is : "+sum);	
	}
}