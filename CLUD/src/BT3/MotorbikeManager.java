package BT3;

import java.util.ArrayList;
import java.util.Scanner;

import BT2.Student;

public class MotorbikeManager {
	Scanner sc = new Scanner(System.in);
	ArrayList<Motorbike> listMotorbikes = new ArrayList<Motorbike>();

	public void addMotobike() {
		System.out.println("nhập ID");
		String id = sc.nextLine();
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if (listMotorbikes.get(i).getBikeId().equalsIgnoreCase(id)) {
				System.out.println("ID bị trùng");
				return;
			}
		}
		System.out.println("nhập name");
		String name = sc.nextLine();
		System.out.println("nhập brand");
		String brand = sc.nextLine();
		System.out.println("nhập price");
		double price = Double.parseDouble(sc.nextLine());
		Motorbike mt = new Motorbike(id, name, brand, price, false);
		listMotorbikes.add(mt);
	}
	
	public void displayMotobike() {
		System.out.println("ID   Name      Brand     Price   Status");
		for (int i = 0; i < listMotorbikes.size(); i++) {
			System.out.println(listMotorbikes.get(i));
		}
	}
	
	public void rentMotobike() {
		System.out.println("Nhập ID xe muốn thuê");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).getBikeId().equals(id)) {
				index =i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Không tìm thấy ID xe muốn thuê");
		}else {
			if(listMotorbikes.get(index).isRented()==true) {
				System.out.println("Xe đã được thuê");
			}else {
				listMotorbikes.get(index).setRented(true);
				System.out.println("Thuê xe thành công");
			}
		}
	}
	
	public void returnMotobike() {
		System.out.println("Nhập ID xe muốn trả");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).getBikeId().equals(id)) {
				index =i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Không tìm thấy ID xe muốn trả");
		}else {
			if(listMotorbikes.get(index).isRented()==false) {
				System.out.println("Xe chưa được thuê");
			}else {
				listMotorbikes.get(index).setRented(false);
				System.out.println("Trả xe thành công");
			}
		}
	}
	
	public void displayfreeMotobike() {
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).isRented() == false) {
				System.out.println(listMotorbikes.get(i));
			}
		}
	}
	
	public void displayRentMotobike() {
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).isRented() == true) {
				System.out.println(listMotorbikes.get(i));
			}
		}
	}
	
	public void removeMotobike() {
		System.out.println("Nhập id cần remove");
		String id = sc.nextLine();
		int index = -1;
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).getBikeId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Không tìm thấy id cần xóa");
		}else {
			listMotorbikes.remove(index);
			System.out.println("Xóa thành công");
		}
		}
	
	public void sumSalary() {
		double sum=0;
		for (int i = 0; i < listMotorbikes.size(); i++) {
			if(listMotorbikes.get(i).isRented() == true) {
				sum+=listMotorbikes.get(i).getRentPrice();
			}
		}
		System.out.println("tổng doanh thu giả định là: "+sum);
	}

}
