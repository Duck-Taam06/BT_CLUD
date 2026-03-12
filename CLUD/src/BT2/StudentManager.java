package BT2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	ArrayList<Student> ListStudent = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void addStudent(){
		System.out.println("nhập ID");
		String id = sc.nextLine();
		for (int i = 0; i < ListStudent.size(); i++) {
			if(ListStudent.get(i).getStudentId().equalsIgnoreCase(id)) {
				System.out.println("ID bị trùng");
				return;
			}
		}
		System.out.println("nhập name");
		String name = sc.nextLine();
		System.out.println("nhập major");
		String major = sc.nextLine();
		System.out.println("nhập gpa");
		double gpa = Double.parseDouble(sc.nextLine());
		if(gpa<0||gpa>4) {
			System.out.println("gpa không vượt quá 4.0");
			return;
		}
		System.out.println("nhập age");
		int age = Integer.parseInt(sc.nextLine());
		Student st = new Student(id, name, major, gpa, age);
		ListStudent.add(st);
	}
	
	public void displayStudent() {
		System.out.println("ID     Name       Major      GPA     Age");
		for (int i = 0; i < ListStudent.size(); i++) {
			System.out.println(ListStudent.get(i));
		}
	}
	
	public void updateStudent() {
		System.out.println("Nhập id cần update");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < ListStudent.size(); i++) {
			if(ListStudent.get(i).getStudentId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Không tìm thấy id cần update");
		}else {
			System.out.println("Nhập new Name");
			ListStudent.get(index).setStudentName(sc.nextLine());
			System.out.println("Nhập new Major");
			ListStudent.get(index).setMajor(sc.nextLine());
			System.out.println("Nhập new GPA");
			ListStudent.get(index).setGpa(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập new Age");
			ListStudent.get(index).setAge(Integer.parseInt(sc.nextLine()));
			System.out.println("Update thành công");
		}
	}
	
	public void removeStudent() {
		System.out.println("Nhập id cần remove");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < ListStudent.size(); i++) {
			if(ListStudent.get(i).getStudentId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Không tìm thấy id cần xóa");
		}else {
			ListStudent.remove(index);
			System.out.println("Xóa thành công");
		}
		}
	
	public void searchByString() {
		System.out.println("Nhập tên cần tìm");
		String name = sc.nextLine().toLowerCase();
		for (int i = 0; i < ListStudent.size(); i++) {
			if(ListStudent.get(i).getStudentName().toLowerCase().contains(name)) {
				System.out.println(ListStudent.get(i));
			}
		}
	}
	
	public void displayExcellentStudent() {
		for (int i = 0; i < ListStudent.size(); i++) {
			if(ListStudent.get(i).getGpa()>=3.5) {
				System.out.println(ListStudent.get(i));
			}
		}
	}
	
	
}
