package BT1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManager {
	ArrayList<Product> productList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void test() {
		productList.add(new Product("P01", "Laptop Dell", "Laptop", 15000000, 5, LocalDate.parse("2024-01-10")));
		productList.add(new Product("P02", "iPhone 14", "Smartphone", 20000000, 3, LocalDate.parse("2024-02-05")));
		productList.add(new Product("P03", "Samsung TV", "Television", 12000000, 4, LocalDate.parse("2023-12-20")));
		productList.add(new Product("P04", "Sony Headphone", "Headphone", 2500000, 10, LocalDate.parse("2024-03-15")));
		productList.add(new Product("P05", "Logitech Mouse", "Mouse", 500000, 15, LocalDate.parse("2024-01-25")));
		productList.add(new Product("P06", "Macbook Pro", "Laptop", 35000000, 2, LocalDate.parse("2024-02-18")));
		productList.add(new Product("P07", "Apple Watch", "Smartwatch", 9000000, 6, LocalDate.parse("2024-03-01")));
		productList.add(new Product("P08", "JBL Speaker", "Speaker", 3000000, 7, LocalDate.parse("2023-11-11")));
		productList.add(new Product("P09", "Canon Camcorder", "Camcorder", 8000000, 3, LocalDate.parse("2024-01-05")));
		productList.add(new Product("P10", "Asus Laptop", "Laptop", 17000000, 4, LocalDate.parse("2024-02-28")));
	}
	public void addProduct() {
		System.out.println("nhập ID");
		String id = sc.nextLine();
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductId().equals(id)) {
				System.out.println("ID đã tồn tại");
				return;
			}
		}
		System.out.println("nhập tên");
		String name = sc.nextLine();
		System.out.println("nhập loại");
		String category = sc.nextLine();
		System.out.println("nhập giá");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("nhập số lượng");
		int quantity = Integer.parseInt(sc.nextLine());
		System.out.println("nhập ngày sản xuất (yyyy-MM-dd)");
		LocalDate date = LocalDate.parse(sc.nextLine());
		Product pr = new Product(id, name, category, price, quantity, date);
		productList.add(pr);
	}

	public void displayProduct() {
		System.out.println("ID	|	Name	|	Category	|	Price	|	Quantity	|	TotalValue");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
	}

	public void upDateProduct() {
		System.out.println("Nhập ID cần sửa");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductId().equals(id)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Không tìm thấy sản phẩm có ID là " + id);
		} else {
			System.out.println("tên mới");
			String newName = sc.nextLine();
			productList.get(index).setProductName(newName);
			System.out.println("loại mới");
			String newCategory = sc.nextLine();
			productList.get(index).setCategory(newCategory);
			System.out.println("giá mới");
			double newPrice = Double.parseDouble(sc.nextLine());
			productList.get(index).setPrice(newPrice);
			System.out.println("số lượng mới");
			int newQuantity = Integer.parseInt(sc.nextLine());
			productList.get(index).setQuantity(newQuantity);
			System.out.println("cập nhật thành công");
		}
	}
	
	public void deleteProduct() {
		System.out.println("Nhập ID cần xóa");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("không tìm thấy sản phẩm cần");
		}else {
			productList.remove(index);
		}
	}
	
	public void searchByName() {
		System.out.println("nhập tên cần tìm");
		String keyWord = sc.nextLine().toLowerCase();
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductName().toLowerCase().contains(keyWord)) {
				System.out.println(productList.get(i));
			}
		}
	}
	
	public void searchByCategory() {
		System.out.println("nhập loại");
		String cate = sc.nextLine();
		
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getCategory().equalsIgnoreCase(cate)) {
				System.out.println(productList.get(i));
			}
		}
	}
	
	public void sortByPrice() {
		 
	}
}
