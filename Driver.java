/**
 * @author Fred Morrison
 *
 */
public class Driver {

	public static void main(String[] args) {

		Animal fido = new Dog("Fido");
		System.out.println(fido.toString());

		Animal whale = new Whale("Free Willy");
		System.out.println(whale.toString());

		Vehicle jet = new Aircraft("747", 350);
		System.out.println(jet.toString());

		Vehicle taxi = new Sedan("Toyota Camry", 5);
		System.out.println(taxi.toString());
	}

}
