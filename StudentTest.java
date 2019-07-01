import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class StudentTest {

	@Test
	void addScoreNormalRamge() 
	{String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(85.0);
		//Assert
		assertEquals("Score not stored correctly ", 85.0, test.getGrade(0), .001);
		
		
	}
@Test 
void addScoreAboveRange()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(300.0);
		//Assert
		assertEquals("Score not stored correctly ", 110.0 , test.getGrade(0), .001);	
}
@Test
void addScoreBelowRange()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(-100.0);
		//Assert
		assertEquals("Score not stored correctly ", 0.00 , test.getGrade(0), .001);	
}
@Test
void letterGradeA()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(900.0);
		grades.add(120.0);
		grades.add(90.0);
		//Assert 
		assertEquals("LetterGrade", LetterGrade.A, test.getLetterGrade());
		
}
@Test
void letterGradeF()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(-900.0);
		grades.add(60.0);
		grades.add(90.0);
		//Assert 
		assertEquals("LetterGrade", LetterGrade.F, test.getLetterGrade());
}
@Test
void letterGradeB()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(80.0);
		grades.add(80.0);
		grades.add(80.0);
		//Assert 
		assertEquals("LetterGrade", LetterGrade.B, test.getLetterGrade());
}
@Test
void letterGradeC()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(70.0);
		
		//Assert 
		assertEquals("LetterGrade", LetterGrade.C, test.getLetterGrade());
}
@Test
void letterGradeD()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(60.0);
		
		//Assert 
		assertEquals("LetterGrade", LetterGrade.D, test.getLetterGrade());
}
@Test
void getAverageR()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		grades.add(60.0);
		grades.add(60.0);
		grades.add(60.0);
		
		//Assert 
		assertEquals("Average", 60.0, test.getAverage(), .001);
}
@Test
void getAverageNull()
{
	String firstName = "";
	String lastName= "";
	String ID = "";
	
	ArrayList<Double> grades = new ArrayList<Double>();
		//Arrange 
		Student test = new Student(firstName, lastName, ID, grades);
		//Act
		
		
		//Assert 
		assertEquals("Average", 0.00, test.getAverage(), .001);
}

}


