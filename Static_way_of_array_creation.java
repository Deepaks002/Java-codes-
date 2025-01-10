import java.util.Arrays;
class Static_way_of_array_creation 
{
	public static void main(String[] args) 
	{
		String s[] ={"ram", "sheela", "maala", "bala", "Ola"};
		System.out.println("Address of the array : "+s); // address
		System.out.println("Elements of the array : "+Arrays.toString(s)); // elements
		System.out.println("Length of the array : "+s.length); // Length
		System.out.println(s[0]); // accesing elements through Index
		System.out.println(s[1]);
		System.out.println(s[2]);
	}
}
