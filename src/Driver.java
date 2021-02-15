
public class Driver {

	public static void main(String[] args) {
		AmongusCharacter c1 = new AmongusCharacter ("Red");
		AmongusCharacter c2 = new AmongusCharacter ("Mint");
		c1.display();
		c2.display();
		
		c1.setName("Imposter");
		c1.display();

	}

}
