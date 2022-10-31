package src;

public class Phone extends Telephone {
	protected String name;

	public Phone(String number, String name) {
		super(number);
		this.name = name;
	}

	@Override
	public void call() {
		System.out.printf("Calling %s from %s's phone%n", number, name);
	}

	@Override
	public void end(){
		System.out.printf("End call %s from %s's phone%n", number, name);
	}
}
	

