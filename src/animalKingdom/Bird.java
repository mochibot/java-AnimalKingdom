package animalKingdom;

class Bird extends Animal
{
	public Bird (int id, String name, int year)   
	{
		super(id, name, year);
	}

	public String move()
	{
		return "fly";
	}

	public String breathe()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "eggs";
	}
}