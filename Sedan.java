
/**
 * @author Fred Morrison
 *
 */
public class Sedan extends Vehicle {

	public Sedan(String name, int maximumPassengers) {
		super(name, maximumPassengers);
	}

	@Override
	public String move() {
		return "rolls";
	}

}
