import java.util.Scanner;
public class Student {
	
	private String name;
	private int SID;
	public double mark1;
	public double mark2;
	public double mark3;
	Course course1,course2,course3;//CLASS LEVEL VARIABLES 
	Scanner input = new Scanner(System.in);		
	
	public void inputCourse1() {
		System.out.print("Enter courses ID of course 1: ");
		String cid = input.next();
		System.out.println("Enter obtained mark: ");
		double mark1 = input.nextDouble();
		course1 = new Course(cid,mark1);
		
	}
	public void inputCourse2() {
		System.out.print("Enter courses ID of course 2: ");
		String cid = input.next();
		System.out.println("Enter obtained mark: ");
		double mark2 = input.nextDouble();
		course2= new Course(cid,mark2);
		
	}
	public void inputCourse3() {
		System.out.print("Enter courses ID of course 3: ");
		String cid = input.next();
		System.out.println("Enter obtained mark: ");
		double mark3 = input.nextDouble();
		course3 = new Course(cid,mark3);
	
	}
		public double  calcAvg() {
	double sum = (course1.getMark() + course2.getMark() + course3.getMark())/3;
	double roundOff =Math.round(sum*100)/100.00;
	return roundOff;
	}
		
	public void printResultSheet() {
		System.out.println("\tResult Sheet");
		System.out.println("===============================");
		System.out.println(toString());
		System.out.println("CourseID\tMarks");
		System.out.println("-------------------------------");
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println("Your avegrage is "+calcAvg());
	}
	
	
	public Student () {
		this.name = "No Name";
		this.SID = -1;
	}//defualt constructor
	
	public Student(String name, int SID) {
		this.name = name;
		this.SID = SID;
	}//initial concstructor 
	
	public String toString() {
		return String.format("Students's Name: %10s %nStudent's SID:   %10s", name,SID);
	}

}//end of class
