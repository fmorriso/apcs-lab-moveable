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
	
	
	/* get a string representation of an instance of this class
	 * @
	 */
	@Override
	public String toString() {
		return String.format("%s is a %s that says %s and it %s",
				super.toString(),
				this.getClass().getSimpleName().toLowerCase(), 
				this.speak(),
				this.move());
	}

}
