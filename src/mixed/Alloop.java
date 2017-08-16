package mixed;

public class Alloop extends Alloop2{

	private String customerName;
	private int trackingNumber;
	private boolean shipped=true;
	private String Address;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public boolean isShipped() {
		return shipped;
	}
	public void setShipped(boolean shipped) {
		this.shipped = shipped;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	

	public String Amazon(String customerName) {
		System.out.println(customerName);
		return customerName;
	}
	
	public String Amazon(String customerName, String Address) {
		System.out.println(Address);
		return Address;
	}
}

