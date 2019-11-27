package animalKingdom;

import java.util.ArrayList;

public class Main
{
	public static void main (String[] args)
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Mammal(1, "Panda", 1869));
		animals.add(new Mammal(2, "Zebra", 1778));
		animals.add(new Mammal(3, "Koala", 1816));
		animals.add(new Mammal(4, "Sloth", 1804));
		animals.add(new Mammal(5, "Armadillo", 1758));
		animals.add(new Mammal(6, "Raccoon", 1758));
		animals.add(new Mammal(7, "Bigfoot", 2021));
		animals.add(new Bird(8, "Pigeon", 1837));
		animals.add(new Bird(9, "Peacock", 1821));
		animals.add(new Bird(10, "Toucan", 1758));
		animals.add(new Bird(11, "Parrot", 1824));
		animals.add(new Bird(12, "Swan", 1758));
		animals.add(new Fish(13, "Salmon", 1758));
		animals.add(new Fish(14, "Catfish", 1817));
		animals.add(new Fish(15, "Perch", 1758));

		System.out.println("====List animals in descending order by year====");	
		animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animals.forEach((animal) -> System.out.println(animal.getName() + " named in: " + animal.getYear()));

		System.out.println("====List animals alphabetically====");	
		animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animals.forEach((animal) -> System.out.println(animal.getName()));

		System.out.println("====List animals order by how they move====");	
		animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animals.forEach((animal) -> System.out.println(animal.getName() + " moves by: " + animal.move()));

		System.out.println("====List animals breathe with lungs====");	
		animals.forEach((animal) -> {
			if (animal.breathe() == "lungs")
			{
				System.out.println(animal.getName());
			}
		});

		System.out.println("====List animals breathe with lungs and named in 1758====");	
		animals.forEach((animal) -> {
			if (animal.breathe() == "lungs" && animal.getYear() == 1758)
			{
				System.out.println(animal.getName());
			}
		});

		System.out.println("====List animals lay eggs and breathe with lungs====");	
		animals.forEach((animal) -> {
			if (animal.breathe() == "lungs" && animal.reproduce() == "eggs")
			{
				System.out.println(animal.getName());
			}
		});

		System.out.println("====List animals named in 1758 alphabetically====");
		animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animals.forEach((animal) -> {
			if (animal.getYear() == 1758)
			{
				System.out.println(animal.getName());
			}
		});

		//for stretch (list is already sorted alphabetically at this point)
		System.out.println("====List animals that are mammals alphabetically====");
		animals.forEach((animal) -> {
			if (animal instanceof Mammal)     //check if animal is instace of Mammal subclass
			{
				System.out.println(animal.getName());
			}
		});
	}
}