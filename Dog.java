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

	/* returns information about how this particular animal moves
	 * @see Animal#move()
	 */
	@Override
	public String move() {
		return MOVE;
	}

	/* returns information about how this particular animal speaks
	 * @see Animal#speak()
	 */
	@Override
	public String speak() {
		return SOUND;
	}

}
