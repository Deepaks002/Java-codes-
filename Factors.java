// WAJP to print Factors of given number.

class l
{
    static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	    System.out.print("Enter the value : ");
	    int a = sc.nextInt();
	    
	    for (int i = 1 ; i<=a/2  ; i++)
	    {
	        if (a%i==0)
	        {
	            System.out.println(i);
	        }
	    }
  }
}