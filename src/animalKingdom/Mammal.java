package animalKingdom;

public class Mammal extends Animal
{
	public Mammal (int id, String name, int year)  
	{
		super(id, name, year);
	}

	public String move()
	{
		return "walk";
	}

	public String breathe()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "live births";
	}
}