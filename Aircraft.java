/**
 * @author Fred Morrison
 *
 */
public class Aircraft extends Vehicle {

	private static final String MOVE = "flies";

	public Aircraft(String name, int maximumPassengers) {
		super(name, maximumPassengers);
	}

	@Override
	public String move() {
		return MOVE;
	}
}
