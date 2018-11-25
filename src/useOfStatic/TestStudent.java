package useOfStatic;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		 
		System.out.println(st1.studentID);
		System.out.println(  "This is for st1 : " + st1.studentGrade );
		System.out.println(st1.studentID = 13);
	
		
		
		Student st2  = new Student();
		
	
		
		System.out.println("This is for st2 : " + st2.studentGrade );
		System.out.println(Student.studentName);
		System.out.println(st1.studentID = 12);
		
		Student.studentName();
		Student.studentName = "Zana";
		System.out.println(Student.studentName());
		

	}

}
