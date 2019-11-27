package animalKingdom;

abstract class Animal
{
	private int id;
	private String name;
	private int year;

	public Animal (int id, String name, int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public abstract String move();
	
	public abstract String breathe();
	
	public abstract String reproduce();

	public String eat()
	{
		return "Nom nom nom nom...";
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}
}