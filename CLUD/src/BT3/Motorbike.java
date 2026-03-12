package BT3;

public class Motorbike {
	private String bikeId;
	private String bikeName;
	private String brand;
	private double rentPrice;
	private boolean isRented;
	
	public Motorbike() {
		
	}
	
	public Motorbike(String bikeId, String bikeName, String brand, double rentPrice, boolean isRented) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.brand = brand;
		this.rentPrice = rentPrice;
		this.isRented = isRented;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

	public String getBikeId() {
		return bikeId;
	}

	@Override
	public String toString() {
		return "bikeId=" + bikeId + ", bikeName=" + bikeName + ", brand=" + brand + ", rentPrice="
				+ rentPrice + ", isRented=" + isRented + "]";
	}
	
	
	
	
}
