package Fenyuk_pet;

public class Dog extends Pet {
	
	public Dog(String name) {
		super(name);
	}
	
    public void voice() {
    	System.out.println("Я " + super.getName() + " - Гаууу-Гаууу.");
	}

}
