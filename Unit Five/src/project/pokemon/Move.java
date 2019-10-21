package project.pokemon;

import java.util.Random;

public class Move {
	int id;
	int category;
	String name;
	String type;
	int pp;
	int ppTotal;
	int power;
	double accuracy;
	
	Move(int id, String name, String type, int category, int pp, int power, double accuracy)
	{
		this.id=id;
		this.name = name;
		this.category=category; // 0- Physical, 1- Special, 2- Status
		this.type = type;
		this.pp = pp;
		this.ppTotal = pp;
		this.power = power;
		this.accuracy = accuracy;
	}
	
	public String useMove(Pokemon a, Pokemon b)
	{
		Random random = new Random();
		if(this.category!=2)
		{
			double chance = random.nextDouble();
			if (chance>=this.accuracy)
			{
				int attack = 1;
				int defense = 1;
				if(this.category==0)
				{
					attack = a.attack;
					defense = a.defense;
				}
				else
				{
					attack = a.attackSpecial;
					defense = a.defenseSpecial;
				}
				double ratio = 0.5;
				double t = (int)Math.ceil((double)a.speed*ratio);
				int m = random.nextInt(255)+1;
				double critical = 1.0;
				if(m<t)
					critical = (2.0*a.level+5.0)/(a.level+5.0);
				double rand = (random.nextDouble()*0.15)+0.85;
				double modifier = critical*rand; // * STAB BONUS!
				int damage = (int)(((((2*a.level/5)+2)*this.power*attack/defense)/50+2)*modifier);
				
				b.takeDamage(damage);
				this.pp--;
				return "\n" + a.nickname + " used " + this.name + " on " + b.nickname + ".\n" + b.nickname + " took " + damage + " damage.";
			}
			else
			{
				return "\n" + a.nickname + " used " + this.name + " on " + b.nickname + ".\n" + a.nickname + "'s attack missed.";
			}
		}
		else
		{
			return "\nA status move was used.";
		}
	}
}
