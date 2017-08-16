package mixed;

public class Alloop2 extends Alloop1 {
	
	public void name(){
		System.out.println("Marhaba");
		}
	public void address() {
		System.out.println("145 Cimarron tr");
		
	}
	public void tracknum() {
		System.out.println(123456789);
	}
	
	public void ship() {
		System.out.println(true);
	}
	public String Amazon(String customerName, String Address) {
		System.out.println("We shipped the order to "+ Address+" .");
		return Address;
 }

}
