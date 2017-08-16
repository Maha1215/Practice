package mixed;

public class Alloop1 {
  

  public static void main(String[] args) {
	   
	Alloop object=new Alloop();
	object.setCustomerName("Marhaba");
	 System.out.println(object.getCustomerName());
	 object.setTrackingNumber(123456789);
	 System.out.println(object.getTrackingNumber());
	 object.setShipped(true);
	 System.out.println(object.isShipped());
	 object.setAddress("145 Cimarron tr");
	 System.out.println(object.getAddress());
	 
}
  public String Amazon(String customerName) {
	System.out.println("We shipped order for "+customerName+" .");
	return customerName;
}
	   
}

