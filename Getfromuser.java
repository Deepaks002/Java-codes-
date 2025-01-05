//WAJP to print values that user Enters.
class Getfromuser
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		int start = 1;
		
		while (start<=a)
		{
			System.out.println(start);
			start++;
		}
	}
}