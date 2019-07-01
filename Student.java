import java.util.ArrayList;

public class Student {



	
static double maxScore = 110;
static double minScore = 0;
private String firstName ="";
private String lastName= "";
private String ID ="";
private ArrayList<Double> grades= new ArrayList<Double>();


public Student(String firstName, String lastName, String ID, ArrayList<Double>grades)
{ 
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.ID = ID;
	this.grades = grades;
	

}

public  void newScores(double score)
{
	
	
	for (int i = 0; i < grades.size(); i++)
	{
		if (grades.get(i) > maxScore)
	{
		grades.remove(i);
		grades.add(maxScore);
		
		
	}
	else if (grades.get(i) < minScore)
	{
		grades.remove(i);
		grades.add(0.0);
		
	}


	}

	
}
public double getAverage ()
{
	if (grades.size() == 0)
	{
		return 0;
	}
	else 
	{int total= 0;
	//newScores();
	
		for (int i = 0; i < grades.size(); i++)
		{  newScores(i);
			 total+= grades.get(i);
			 
		}
		return total/grades.size();
		
	}
}

public LetterGrade getLetterGrade()
{
	int average = ((int)Math.round(getAverage()) / 10);
	switch(average)
	{
	case(11):
	case(10):
	case(9):
	{
		return LetterGrade.A;
	}
	case(8):
	{
		return LetterGrade.B;
	}
	case(7):
	{
		return LetterGrade.C;
	}
	case(6):
	{
		return LetterGrade.D;
	}
	default:
	{
		return LetterGrade.F;
	}
	}
}

public String toString ()
{
	return  "First Name:" + getFirstName()  + " \nLast Name:"+ getLastName()+
			"\nID:" + getID() + "\nGrades" + getGrades() + "\nThe Average is:"+ getAverage()
			+ "\nThe Letter Grade is:" + getLetterGrade(); 
}

public String getFirstName()
{
return firstName;

}
public ArrayList getGrades()
{  
	for (int i = 0;i<grades.size();i++)
{
	newScores(i);
	
}
	return grades;
	
}
public double getGrade(int index)
{
	getGrades();
	
	return grades.get(index);
	
}
public String getID()
{
	return ID;
	
}
public String getLastName()
{
	return lastName;
	
}



}
