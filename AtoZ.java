//WAJP to print A to Z.
class AtoZ
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the Character : ");
		char a = sc.next().charAt(0);	
		char end = 'z';
		
		while (a<=end)
		{
			System.out.println(a);
			a++;
		}
	}
}