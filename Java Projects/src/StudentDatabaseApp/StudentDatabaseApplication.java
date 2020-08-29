package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		System.out.print("Enter the number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n = 0; n <numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		System.out.println(students[2].toString());

	}

}

class Student{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor with name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First name : ");
		this.firstName = in.nextLine();
		System.out.print("Enter Student Last name : ");
		this.lastName = in.nextLine();
		System.out.print("1- for Freshman\n2 - for Sophmore\n3 - for Junior\n4 - for Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();		
	}
	// create an Id
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	//Enroll in courses
	public void enroll() {
		//get into loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses += "\n	" + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);
	}
	//view Balance
	public void showBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	//pay tuition
	public void payTuition() {
		showBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		showBalance();
	}
	//show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Year: " + gradeYear+
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses+
				"\nBalance: $" + tuitionBalance;
	}
}