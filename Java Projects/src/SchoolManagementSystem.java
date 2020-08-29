import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		
		Student brett = new Student(1, "Brett", 12);
		Student tamasha = new Student(2, "tamasha", 4);
		Student rakshith = new Student(3, "Rakshith Vasudev", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(brett);
		studentList.add(tamasha);
		studentList.add(rakshith);
		
		School ghs = new School(teacherList, studentList);
		System.out.println(ghs.getTotalSpent());
	}
}

class School{
	private List<Teacher> teachers;
	private List<Student> students;
	private int earnedTotal;
	private int totalSpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		this.earnedTotal = 0;
		this.totalSpent = 0;
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getEarnedTotal() {
		return earnedTotal;
	}

	public void updateEarnedTotal(int earnedTotal) {
		this.earnedTotal += earnedTotal;
	}

	public int getTotalSpent() {
		return totalSpent;
	}
	
	public void updateTotalSpent(int moneySpent) {
		this.totalSpent += moneySpent;
	}
	
	
}

class Student{
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feeTotal;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feeTotal = 3000;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeeTotal() {
		return feeTotal;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void updateFeesPaid(int paid) {
		this.feesPaid += paid;
	}
}

class Teacher{
	private int id;
	private String name;
	private int salary;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}