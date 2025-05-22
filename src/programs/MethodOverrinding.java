package programs;

class Cat
{
	public void eat()
	{
		System.out.println("from parent class cat drink milk");
	}
	public void leg()
	{
		System.out.println("from parent class cat has 4 legs");
	}
	public void sound()
	{
		System.out.println("from parent class cat sounds myooo");
	}
}
class Bird extends Cat
{
	public void eat()
	{
		System.out.println("from child class bird drink water");
	}
	public void leg()
	{
		System.out.println("from child class bird has 2 legs");
	}
	public void fly()
	{
		System.out.println("from child class bird can fly");
	}
}

public class MethodOverrinding {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eat();
		c.leg();
		c.sound();
		Bird b=new Bird();
		b.eat();
		b.fly();
		b.leg();
	}

}
