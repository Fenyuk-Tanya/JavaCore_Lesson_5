package Fenyuk_pet;

public class Application {
	
	public static void main(String[] args) {
		
		Cow cow = new Cow ("корова");
		Cat cat = new Cat ("кіт");
		Dog dog = new Dog ("пес");

		cow.voice();
		cat.voice();
		dog.voice();
	}

}
