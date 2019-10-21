package project.pokemon;

class Pokemon {
	int id;
	String name;
	String type;
	String[] weakness;
	
	String nickname;
	int level;
	int xp;
	int hp;
	
	int xpType; // Types: 0- Erratic, 1- Fast, 2- Medium Fast, 3- Medium Slow, 4- Slow, 5- Fluctuating
	int xpNeeded;
	
	int hpTotal;
	int attack;
	int defense;
	int attackSpecial;
	int defenseSpecial;
	int speed;
	
	int[] bases;
	Move[] moves;
	
	public Pokemon(int id, String name, String type, String[] weakness, int xpType, int hpTotal, int attack, int defense, int attackSpecial, int defenseSpecial, int speed, Move[] moves)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.weakness = weakness;
		
		this.xpType = xpType;
		
		this.hpTotal = hpTotal;
		this.attack = attack;
		this.defense = defense;
		this.attackSpecial = attackSpecial;
		this.defenseSpecial = defenseSpecial;
		this.speed = speed;
		
		this.bases = new int[6];
		bases[0] = hpTotal;
		bases[1] = attack;
		bases[2] = defense;
		bases[3] = attackSpecial;
		bases[4] = defenseSpecial;
		bases[5] = speed;
		
		this.nickname = name;
		this.level = 1;
		this.xp = 0;
		this.xpNeeded = getXpNeeded();
		this.hp = hpTotal;
		
		this.moves = moves;
	}
	
	// Accessors
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
		setXpByLevel();
	}
	
	// Mutators
	public void takeDamage(int amount)
	{
		if(this.hp>=amount)
			this.hp-=amount;
		else
			this.hp=0;
	}
	
	public void xpUp(int amount)
	{
		this.xp+=amount;
		if(xp>xpNeeded)
			levelUp();
	}
	
	public void setXpByLevel()
	{
		this.xp = getXpNeeded(this.level);
		this.xpNeeded = getXpNeeded(this.level+1);
	}
	
	public void levelUp()
	{
		this.level++;
		this.xpNeeded = getXpNeeded(this.level+1);
	}
	
	// Utility
	private int getXpNeeded(int level) // Returns the XP needed to reach the next level;
	{
		// Equations taken from: https://bulbapedia.bulbagarden.net/wiki/Experience
		
		if(this.xpType==0) // Erratic
		{
			if(level<=50)
				return ((int)Math.pow(level, 3)*(100-level))/50;
			else if(level<=68)
				return ((int)Math.pow(level, 3)*(150-level))/100;
			else if(level<=98)
				return ((int)Math.pow(level, 3)*((1911-(level*10))/3))/500;
			else
				return ((int)Math.pow(level, 3)*(100-level))/50;
		}
		else if(this.xpType==1) // Fast
		{
			return (4*(int)Math.pow(level, 3))/5;
		}
		else if(this.xpType==2) // Medium Fast
		{
			return (int)Math.pow(level, 3);
		}
		else if(this.xpType==3) // Medium Slow
		{
			return ((6*(int)Math.pow(level, 3))/5) - (15*(int)Math.pow(level, 3)) + (100*level) - 140;
		}
		else if(this.xpType==4) // Slow
		{
			return (5*(int)Math.pow(level, 3))/4;
		}
		else if(this.xpType==5) // Fluctuating
		{
			if(level<=15)
				return (int)Math.pow(level, 3) * (((level+1)/3) + 24)/50;
			else if(level<=36)
				return (int)Math.pow(level, 3) * (level+14)/50;
			else
				return (int)Math.pow(level, 3) * ((level/2)+32)/50;
		}
		else
		{
			System.out.println("ERROR: Fatal error reached.\nPokémon " + this.nickname + " has an invalid XP Type.");
			return 0;
		}
	}
	
	private int getXpNeeded()
	{
		return getXpNeeded(this.level+1);
	}
	
}