/* Early Instantiation 
     The process of creating dependent object inside another object and Initialize in a single line.
*/
class Engine 
{
	//STATES - should be represented by non-static variables
	int cc;
	String power;
	String type;
	
	//CONSTRUCTOR
	public Engine(int cc, String power, String type)
	{
		this.cc=cc;
		this.power=power;
		this.type=type;
	}
	
	//BEHAVIOURS - should be represented by non-static method
	public void detailsofengine()
	{
		System.out.println("Engine cc : "+cc);
		System.out.println("Engine power : "+power);
		System.out.println("Engine type : "+type);
	}
}

class Car
{
	//STATES
	String name;
	String color;
	int price;
	Engine e;
	String owner = "Deepak";
	
	//CONSTRUCTOR
	public Car(String name, String color, int price, Engine e)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	
	//BEHAVIOURS
	public void detailsofcar()
	{
		System.out.println("Car name: "+name);
		System.out.println("Car color: "+color);
		System.out.println("Car price: "+price);
		System.out.println("*******************************");
	}
}

class Earlyinstantiation
{
	public static void main(String[]args)
	{
		// Creating dependent object inside another object and initialize in a singl line
		Car c1 = new Car("BMW","Black",12000000, new Engine(3000,"8000hp","Petrol"));
		c1.detailsofcar();
		c1.e.detailsofengine();
	}
}
