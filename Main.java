import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	


public static void main(String [] args)
{
	Scanner scanner = new Scanner(System.in);

System.out.println("Enter First Name");
 String firstName = scanner.nextLine();

System.out.println("Enter Last Name");
String lastName = scanner.nextLine();

System.out.println("Enter Student ID");
String ID = scanner.nextLine();

ArrayList<Double> grades = new ArrayList<Double>();
System.out.println("Enter Grades");
while (scanner.hasNextInt())
{
	Double  i = scanner.nextDouble();
	grades.add(i);
}
Student student = new Student(firstName, lastName, ID, grades);

System.out.println(student);

}

}
