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
	}

}
