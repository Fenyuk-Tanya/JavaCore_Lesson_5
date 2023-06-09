package Fenyuk_pet;

public class Cow extends Pet {
	
	public Cow(String name) {
		super(name);
	}
	
	public void voice() {
		System.out.println("Я " + super.getName() + " - Мууу-Мууу.");
	}

}
