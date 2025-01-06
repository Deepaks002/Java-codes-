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

/*
class Largestofthree
{
	public static void main (String args[])
	{
		int a=10,b=20,c=30;
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println(c+"is second Largest");
			}
			else
				System.out.println(a+"is second Largest");
		}
		else if(b>c)
			System.out.println(c+" is Second Largest");
		else
			System.out.println(b+"is Second Largest");
	}
}
*/

/*
class XylemPholeam
{
	public static void main(String args[])
	{
		int n = 1236;
		int fl = 0;
		int sm =0;
		int last = n%10;
		n/=10;
		
		while (n>9)
		{
			sm=sm+n%10;
			n/=10;
		}
		fl = n+last;
		
		if (sm==fl)
		{
			System.out.println("Xylem");
		}
		else
			System.out.println("Pholeam");
	}
}
*/

/*
 class Decimaltobinary
 {
	 public static void main(String []args)
	 {
		int d=9;
		String b = "";
	while (d>0)
	{
		b = b+d%2;
		d=d/2;
	}
	System.out.println(b);
	 }
 } 
 */
 
 /*
 
 class Bike
 {
	 //STATES of the object should be represented by "NON-STATIC VARIABLE"
	 String name;
	 double price;
	 String color;
	 String ownername;
	 
	 //BEHAVIOURS of the object should be reprsented by "NON STATIC METHOD"
	 public void run()
	 {
		System.out.println("Running");
	 }
	 public void stop()
	 {
		System.out.println("Stop");
	 }
 }
 */
 
 /*
 class Student
 {
	 //States
	 String name;
	 int id;
	 double marks;
	 static String school = "Vivega";
	 
	 //Constructor
	 public Student(String n, int i, double m) // Parameterized Constructor
	 {
		name = n;
		id = i;
		marks = m;
	 }
	 
	 //Behaviours
	 public void detailsofstudents()
	 {
		System.out.println("Student name : "+name);
		System.out.println("Student id : "+id);
		System.out.println("Student marks : "+marks);
		System.out.println("School : "+school);
		System.out.println("********************");
	 }
 }
 */
 /*
class Employee
{
	//States
	String name;
	int id;
	double sal;
	String Company_name = "OmegaHealthcare";
	
	//Contructor - > Parameterized Constructor
	public Employee(String n, int i, double s)
	{
		name = n;
		id = i;
		sal = s;
	}
	//Behaviours
	public void detailsofemployee()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee salary : "+sal);
		System.out.println("Employee Office : "+Company_name);
		System.out.println("*************************");
	}
}
*/