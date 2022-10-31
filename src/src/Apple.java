package src;

public class Apple extends Phone{
	private String serialnumber;
	private final String BRAND = "Apple";

	public Apple(String number, String name, String serialnumber) {
		super(number, name);
		this.serialnumber = serialnumber;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	
	
	public void call() {
		System.out.printf("Incoming call %s from %s's %s phone", number, name, BRAND);
		if (serialnumber != null) {
			System.out.print(serialnumber);
		}
		System.out.println();
	}

	public void end() {
		
		System.out.printf("End call %s from %s's phone with %s ", number, name, BRAND);
		if (serialnumber != null) {
			System.out.print(serialnumber);
		}
		System.out.println();
	}
	
}



