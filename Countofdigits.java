// WAJP to print count of digits.
class Countofdigits
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String []args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int count = 0;
		
		while (a>0 || a<0)
		{
			count++;
			a/=10; //a=a/10
		}
		System.out.println("Total Character is : "+count);
	}
}