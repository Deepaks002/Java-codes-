//WAJP to print z to a.
class ZtoA
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String []args)
	{
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);
		char end = 'a';
		
		while (ch>=end)
		{
			System.out.println(ch);
			ch--;
		}
	}
}