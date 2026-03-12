package BT1;

import java.time.LocalDate;

public class Product {
	private String productId;
	private String productName;
	private String category;
	private double price;
	private int quantity;
	private LocalDate manufactureDate;

	public Product(String productId, String productName, String category, double price, int quantity,
			LocalDate manufactureDate) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.manufactureDate = manufactureDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public double getTotalValue() {
		return price*quantity;
	}

	@Override
	public String toString() {
		return "productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", quantity=" + quantity + ", manufactureDate=" + manufactureDate + "]";
	}
	
	
}
