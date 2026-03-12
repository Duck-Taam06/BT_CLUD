package BT2;

public class Student {
	private String studentId;
	private String studentName;
	private String major;
	private double gpa;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String studentId, String studentName, String major, double gpa, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
		this.gpa = gpa;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentId() {
		return studentId;
	}

	public boolean isExcellent() {
		if(gpa >= 3.5) {
			return true;
		} return false;
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", studentName=" + studentName + ", major=" + major + ", gpa=" + gpa
				+ ", age=" + age + "]";
	}
	
	

}
