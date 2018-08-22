/**
 * @author Fred Morrison
 *
 */
public class Whale extends Animal {

	public Whale(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return "ooga";
	}

	@Override
	public String move() {
		return "swims";
	}

}
