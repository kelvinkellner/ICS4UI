package project.school;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	int grade;
	ArrayList<Mark> marks;
	
	boolean honours;
	
	Student(int id, String n, int g, ArrayList<Mark> m)
	{
		this.id = id;
		this.name = n;
		this.grade = g;
		this.marks = m;
		
		for(int i=0;i<this.marks.size();i++)
			this.marks.get(i).classroom.students.add(this);
	}
	
	int getMark(Classroom c)
	{
		for(int i=0;i<this.marks.size();i++)
		{
			if(this.marks.get(i).classroom.equals(c))
				return this.marks.get(i).mark;
		}
		return -1;
	}
	
	int average()
	{
		int total = 0;
		for(int i=0;i<this.marks.size();i++)
			total+=this.marks.get(i).mark;
		return total;
	}
	
	boolean honours()
	{
		if(this.average()>=80)
			honours=true;
		else
			honours=false;
		return honours;
	}
}