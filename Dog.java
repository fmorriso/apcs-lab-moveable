/**
 * @author Fred Morrison
 *
 */
public class Dog extends Animal {

	private static final String MOVE = "runs";
	private static final String SOUND = "Woof";

	public Dog(String name) {
		super(name);
	}

	@Override
	public String move() {
		return MOVE;
	}

	@Override
	public String speak() {
		return SOUND;
	}

}
