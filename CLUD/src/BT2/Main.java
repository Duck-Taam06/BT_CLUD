package BT2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		int choice = 0;
		do {
			System.out.println("===== STUDENT MANAGEMENT =====\r\n" + "\r\n" + "1. Thêm sinh viên\r\n"
					+ "2. Hiển thị danh sách sinh viên\r\n" + "3. Cập nhật sinh viên\r\n" + "4. Xóa sinh viên\r\n"
					+ "5. Tìm sinh viên theo tên\r\n" + "6. Hiển thị sinh viên xuất sắc\r\n" + "7. Thoát\r\n" + "");
			System.out.println("Nhập lựa chọn");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.displayStudent();
				break;
			case 3:
				sm.updateStudent();
				break;
			case 4:
				sm.removeStudent();
				break;
			case 5:
				sm.searchByString();
				break;
			case 6:
				sm.displayExcellentStudent();
				break;
			}
		} while (choice != 7);

	}

}
