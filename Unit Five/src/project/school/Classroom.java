package project.school;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
	Teacher teacher;
	ArrayList<Student> students;
	
	String code;
	String level;
	int period;
	
	Classroom(Teacher t, String c, String l, int p)
	{
		teacher = t;
		students = new ArrayList<Student>();
		code = c;
		level = l;
		period = p;
	}
	
	void enroll(Student s, int mark)
	{
		this.students.add(s);
		Mark m = new Mark(this, mark);
		s.marks.add(m);
	}
	
	void enroll(Student s)
	{
		enroll(s, 0);
	}
	
	void unEnroll(Student s)
	{
		this.students.remove(s);
	}
	
	double mean()
	{
		int total = 0;
		
		for(int i=0;i<this.students.size();i++)
			total+=this.students.get(i).getMark(this);
		
		if(this.students.size()!=0)
			return total/this.students.size();
		return 0;
	}
	
	double median()
	{
		int[] m = new int[this.students.size()];
		
		for(int i=0;i<this.students.size();i++)
			m[i]=this.students.get(i).getMark(this);
		
		Arrays.sort(m);
		
		return m[m.length/2];
	}
	
	int getMark(Student s)
	{
		for(int i=0;i<s.marks.size();i++)
		{
			if(s.marks.get(i).classroom.equals(this))
				return s.marks.get(i).mark;
		}
		return -1;
	}
}