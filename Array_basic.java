/* Array Basics
1) How to declare an array
2) How to Initialize an array
3) How to access the elements of the array
*/

import java.util.Arrays;
class Array_basic
{
	public static void main(String[] args) 
	{
		double a[] = new double[3]; // Declaring an array
		
		System.out.println("Address of the array : "+a); // Address of the Array will be printed
		System.out.println("Default values of array : "+Arrays.toString(a)); // Default values will be printed
		
		// Initialize an array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println("Accesing the elements of the array : "+Arrays.toString(a)); // Accesing the elemnts of the array
	}
}
