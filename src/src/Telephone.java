package src;

public abstract class Telephone {
	
	protected String number;

	public Telephone(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public abstract void call();
	public abstract void end();

}
