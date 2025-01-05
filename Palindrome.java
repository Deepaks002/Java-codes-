// WAJP to print Palindrome or not.
class Palindrome
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int original = a;
		String rev="";
		
		while (a>0)
		{
			rev = rev + (a%10);
			a=a/10;
		}
		if (Integer.parseInt(rev) == original)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
			}
	}
}