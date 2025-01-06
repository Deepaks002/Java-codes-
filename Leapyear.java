// WAJP to find Leap year or Not	

import java.util.Scanner;
class Leapyear
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the year : ");
		int a = sc.nextInt();
		
		String res = ((a%4==0 && a%100 != 0) || a%400 ==0)? a+" is a leap year" : a+" is not a leap year";
		System.out.println(res);
	}
}