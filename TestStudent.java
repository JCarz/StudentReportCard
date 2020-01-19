
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();//uses default constructor
		Student student2 = new Student("Alex",12345);//inital constructor
		//System.out.println(student1);
		//System.out.println(student2);
		
		
		student2.inputCourse1();
		student2.inputCourse2();
		student2.inputCourse3();
		student2.printResultSheet();
		
		
		
		
		
		
		
		
	}//end of main

}//end of class
