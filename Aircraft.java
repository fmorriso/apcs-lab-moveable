/**
 * @author Fred Morrison
 *
 */
public class Aircraft extends Vehicle {

	public Aircraft(String name, int maximumPassengers) {
		super(name, maximumPassengers);
	}

	@Override
	public String move() {
		return "flies";
	}
}
