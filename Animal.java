/*
 * B. Kerr
 * 8/21/18
 * contains abstract method speak()
 */
public abstract class Animal implements Moveable {

	// instance data
	private String name;

	// constructor creates an Animal with the specified name
	// @param newName this Animal object's name
	//
	public Animal(String newName) {
		name = newName;
	}

	// accessor method
	// @return this object's name; can be null
	//
	public String getName() {
		return name;
	}

	/*
	 * Returns a string representation of this class
	 * 
	 * Example: Animal Fido is a dog that says Woof and it runs
	 * 
	 */
	public String toString() {	
		return String.format("%s %s is a %s that says %s and it %s",
				Animal.class.getName(), this.name,
				this.getClass().getSimpleName().toLowerCase(), this.speak(),
				this.move());
	}

	// this method should return a string indicating what the Animal says.
	public abstract String speak();

	@Override
	public String move() {
		return null;
	}

}
