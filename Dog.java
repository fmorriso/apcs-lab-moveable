
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String move() {
		return "runs";
	}
	
	@Override
	public String speak() {
		return "Woof";
	}



}
