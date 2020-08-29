import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String alternateEmail;
	String forPassword = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*?~";
	private String password;
	private int passLength = 10;
	private int mailCapacity = 500;
	private String companySuffix = "company.com";
	
	Email(String first, String last){
		this.firstName = first;
		this.lastName = last;
		this.mailCapacity = 20;
		
		this.department = setDepartment();
		System.out.print("Password length: ");
		Scanner in = new Scanner(System.in);
		int passLength = in.nextInt();
		this.password = generatePassword(passLength);
		
		this.email = setEmailAddress();
	}
	
	private String setDepartment() {
		System.out.print("New worker: "+ firstName + ". Enter the Department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	public void getName() {
		System.out.println(firstName + " " + lastName);
	}
	
	public void getEmail() {
		System.out.println(email);
	}
	
	public void getMailCapacity() {
		System.out.println(mailCapacity);
	}
	
	public void changePassword(String pass) {
		this.password = pass;
	}
	
	private String generatePassword(int length) {
		String pass = "";
		for(int i = 0; i < length; i++) {
			pass += this.forPassword.charAt((int) Math.floor(Math.random() * (this.forPassword.length() - 1)));
		}
		return pass;
	}
	
	public void changeMailCapacity(int amount) {
		this.mailCapacity = amount;
	}
	
	private String setEmailAddress() {
		if(this.department == "") {
			return  (this.firstName + '.' + this.lastName + "@" + this.companySuffix);
		}else {
			return (this.firstName + '.' + this.lastName + "@" + this.department + "." + this.companySuffix);
		}
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail; 
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: "+ email + 
				"\nMAILBOX CAPACITY: "+ mailCapacity + "mb";
	}
}
