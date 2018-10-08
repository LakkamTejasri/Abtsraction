package abstra;

public class MaruthiCar extends Car{
	
	MaruthiCar(String name,int id)
	{
		super(id);
		System.out.println(name);
		System.out.println(id);
		System.out.println("sub class con");
	}

	protected void speed() 
	{
		System.out.println("abs1");
	}

	void handle()
	{
	
		System.out.println("abs2");
		
	}
	
}
