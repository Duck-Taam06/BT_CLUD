package BT1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductManager pm = new ProductManager();
		int choice = 0;
		pm.test();
		do {
			System.out.println("===== PRODUCT MANAGEMENT =====");
			System.out.println("1. Thêm sản phẩm");
			System.out.println("2. Hiển thị danh sách sản phẩm");
			System.out.println("3. Cập nhật sản phẩm");
			System.out.println("4. Xóa sản phẩm");
			System.out.println("5. Tìm sản phẩm theo tên");
			System.out.println("6. Tìm sản phẩm theo loại");
			System.out.println("7. Hiển thị sản phẩm có giá > X");
			System.out.println("8. Sắp xếp theo giá tăng dần");
			System.out.println("9. Sắp xếp theo số lượng giảm dần");
			System.out.println("10. Tính tổng giá trị kho");
			System.out.println("11. Hiển thị sản phẩm sắp hết hàng");
			System.out.println("12. Thoát");
			System.out.println("Chọn");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				pm.addProduct();
				break;
			case 2:
				pm.displayProduct();
				break;
			case 3:
				pm.upDateProduct();
				break;
			case 4:
				pm.deleteProduct();
				break;
			case 5:
				pm.searchByName();
				break;
			case 6:
				pm.searchByCategory();
				break;
				
			}
		} while (choice != 12);
	}
}
