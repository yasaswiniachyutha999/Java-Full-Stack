class Animal
{
	public void sound()
	{
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog makes sound");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Cat makes sound");
	}
}


class Inheritence_Polymorphism
{
	public static void main(String args[])
	{
		//inheritence
		Animal obj;
		
		// polymorphism
		obj= new Dog();
		obj.sound();

		obj = new Cat();
		obj.sound();
	}
}

		
		
	

	