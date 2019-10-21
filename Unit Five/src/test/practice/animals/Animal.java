package test.practice.animals;

class Animal {
	
	// Fields
	
	private String species;
	private int age;
	private String sound;
	private int legs;
	
	// Constructor Methods
	
	Animal(String species, int age, String sound, int legs)
	{
		this.species = species;
		this.age = age;
		this.sound = sound;
		this.legs = legs;
	}
	
	Animal(String species, int age)
	{
		this.species = species;
		this.age = age;
		this.sound = "null";
		this.legs = 0;
	}
	
	Animal(String species, String sound)
	{
		this.species = species;
		this.age = 0;
		this.sound = sound;
		this.legs = 0;
	}
	
	// Instance Methods
	public void ageUp()
	{
		this.age++;
	}
	
	public void talk()
	{
		System.out.println(this.species + " says " + this.sound);
	}

	// Accessor and Mutator Methods
	
	public String getSpecies()
	{
		return species;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSound()
	{
		return sound;
	}

	public void setSound(String sound)
	{
		this.sound = sound;
	}

	public int getLegs()
	{
		return legs;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}
}
