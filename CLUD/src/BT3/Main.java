package BT3;

import java.util.Scanner;

import BT2.StudentManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MotorbikeManager moto = new MotorbikeManager();
		int choice = 0;
		do {
			System.out.println("===== MOTORBIKE RENTAL MANAGEMENT =====\r\n" + "\r\n" + "1. Thêm xe\r\n"
					+ "2. Hiển thị danh sách xe\r\n" + "3. Thuê xe\r\n" + "4. Trả xe\r\n" + "5. Xóa xe\r\n"
					+ "6. Hiển thị xe đang rảnh\r\n" + "7. Hiển thị xe đang được thuê\r\n"
					+ "8. Thoát\r\n" + "");
			System.out.println("Nhập lựa chọn");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				moto.addMotobike();
				break;
			case 2:
				moto.displayMotobike();
				break;
			case 3:
				moto.rentMotobike();
				break;
			case 4:
				moto.returnMotobike();
				break;
			case 5:
				moto.removeMotobike();;
				break;
			case 6:
				moto.displayfreeMotobike();;
				break;
			case 7:
				moto.displayRentMotobike();;
				break;
			}
		} while (choice != 8);

	}

}
