package useOfStatic;

public class Student {
	int studentID;// non static variable that is belong to object 
	public static String studentName; // static variable 
	
	public static int studentGrade = 80; // static variable . this belong to class 
	
	public void getStudentID() {// non static not return type method 
	
		System.out.println(studentID);
	}
	
	public static String studentName() {// static method , we can call without creating an object
		
		return studentName;// static String return type method 
	}
		

}
