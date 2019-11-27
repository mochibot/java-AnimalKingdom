package animalKingdom;

class Fish extends Animal
{
	public Fish (int id, String name, int year)
	{
		super(id, name, year);
	}

	public String move()
	{
		return "swim";
	}

	public String breathe()
	{
		return "gills";
	}

	public String reproduce()
	{
		return "eggs";
	}
}