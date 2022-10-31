package src;

public class Android extends Phone{
	private String serialnumber;
	private String brand;

	public Android(String number, String name, String serialnumber, String brand) {
		super(number, name);
		this.serialnumber = serialnumber;
		this.brand = brand;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	
	
	public void call() {
		System.out.printf("Incoming call %s from %s's %s phone", number, name, brand);
		if (serialnumber != null) {
			System.out.print(serialnumber);
		}
		System.out.println();
	}

	public void end() {
		
		System.out.printf("End call %s from %s's phone with %s ", number, name, brand);
		if (serialnumber != null) {
			System.out.print(serialnumber);
		}
		System.out.println();
	}
	
}
