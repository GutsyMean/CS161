package lab1BDriver;

import java.util.*;

public class Student 
{
	String name;
	char grade;
	double average;
	int[] scores = new int[5];
	int total = 0;
	
	public Student()
	{
		this.name = "null";
		this.grade = 'F';
		this.average = 0;
	}
	public Student(String name, int[] scores)
	{
		this.name = name;
		this.scores = scores;
	}
	
	
	public String getName()
	{
		return name;
	}
	public char getGrade()
	{
		return grade;
	}
	public double getAverage()
	{
		return average;
	}
	public int[] getScores()
	{
		return scores;
	}
	
	
	
	public void setName (String name)
	{
		this.name = name;
	}
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	public void setAverage(double average)
	{
		this.average = average;
	}
	public void setScores(int[] scores)
	{
		this.scores = scores;
	}
	
	
	public void calculateAverage(int[] scores)
	{
		for (int i = 0; i<scores.length; i++)
		{
			this.total += scores[i];
			this.average = this.total/i;
		}
		
	}
	public void calculateGrade(double average)
	{
		if (average>=90)
			this.grade = 'A';
		else if (average>=80 && average<90)
			this.grade = 'B';
		else if (average>=70 && average<80)
			this.grade = 'C';
		else if (average>=60 && average<70)
			this.grade = 'D';
		else 
			this.grade = 'F';
	}
//	public void generateOutput()
	
}





