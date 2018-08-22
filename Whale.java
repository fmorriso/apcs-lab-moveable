
public class Whale extends Animal {

	public Whale(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return "ooga";
	}
	
	public String move() {
		return "swims";
	}

}
