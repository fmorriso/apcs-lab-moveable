/**
 * @author Fred Morrison A generic vehicle class
 *
 */
public abstract class Vehicle implements Moveable {

	private String name;
	private int maximumPassengers;

	public Vehicle(String name, int maximumPassengers) {
		this.name = name;
		this.maximumPassengers = maximumPassengers;
	}

	public int getMaximumPassengers() {
		return maximumPassengers;
	}

	/**
	 * @param maximumPassengers
	 *            - the maximum number of passengers the vehicle can hold
	 */
	public void setMaximumPassengers(int maximumPassengers) {
		this.maximumPassengers = maximumPassengers;
	}

	/**
	 * @return name - the name of the vehicle
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            - the vehicle name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String move() {
		return null;
	}

	@Override
	public String toString() {
		// Example: Vehicle 747 is a plane that carries 400 and it flies
		return String.format("%s %s is a %s that carries %d and it %s", Vehicle.class.getName(), this.name,
				this.getClass().getSimpleName().toLowerCase(), this.getMaximumPassengers(), this.move());
	}

}
