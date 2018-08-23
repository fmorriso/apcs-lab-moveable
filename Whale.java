/**
 * @author Fred Morrison
 *
 */
public class Whale extends Animal {

	private static final String MOVE = "swims";
	private static final String SOUND = "ooga";

	public Whale(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return SOUND;
	}

	@Override
	public String move() {
		return MOVE;
	}

}
