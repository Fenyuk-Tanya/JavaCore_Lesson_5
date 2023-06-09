package Fenyuk_pet;

public class Cat extends Pet {
	
	public Cat(String name) {
		super(name);
	}
	
    public void voice() {
    	System.out.println("Я " + super.getName() + "- Мяууу-Мяууу.");
	}

}
