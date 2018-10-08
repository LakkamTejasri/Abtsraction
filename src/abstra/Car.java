package abstra;

abstract class Car {
	
	 Car(int id)
	 {
		 System.out.println("car class");
	 }

	protected abstract void speed();
	abstract void handle();
    public void Break()
	{
		System.out.println("I break the car");
	}
    protected MaruthiCar maruthicar;
}
