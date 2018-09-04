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
	
	@Override
	public String toString() {
		// Example: Vehicle 747 is a plane that carries 400 and it flies
		return String.format("%s is an %s that carries %d and it %s",
				super.toString(),
				this.getClass().getSimpleName().toLowerCase(),
				this.getMaximumPassengers(), this.move());
	}
}
