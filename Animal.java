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

	// @return a String representation of this Animal
	//
	public String toString() {
		return "Animal " + name;
	}

	// this method should return a string indicating what the Animal says.
	public abstract String speak();

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}

}
