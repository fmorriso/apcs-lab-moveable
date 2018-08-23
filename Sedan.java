
/**
 * @author Fred Morrison
 *
 */
public class Sedan extends Vehicle {

	private static final String MOVE = "rolls";

	public Sedan(String name, int maximumPassengers) {
		super(name, maximumPassengers);
	}

	@Override
	public String move() {
		return MOVE;
	}

}
