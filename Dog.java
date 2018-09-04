/**
 * @author Fred Morrison
 *
 */
public class Dog extends Animal {

	private static final String MOVE = "runs";
	private static final String SOUND = "woof";

	public Dog(String name) {
		super(name);
	}

	/*
	 * returns information about how this particular animal moves	 * 
	 * 
	 */
	@Override
	public String move() {
		return MOVE;
	}

	/*
	 * returns information about how this particular animal speaks
	 * 
	 * @see Animal#speak()
	 */
	@Override
	public String speak() {
		return SOUND;
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
