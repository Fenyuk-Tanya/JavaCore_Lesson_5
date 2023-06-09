package Fenyuk_pet;

public abstract class Pet {
	 
	private String name;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public abstract void voice();

	public String getName() {
		return name;
	}
	
	

}
