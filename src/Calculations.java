
public class Calculations {

	public int generateRandomInt() {
		int randomInt = (int) (Math.random() * ((22 - 1) + 1)) + 1;
		return randomInt;
	}
	
	public void cardDraw() {
		Calculations player = new Calculations();
		Calculations dealer = new Calculations();
		
		int dcard = dealer.generateRandomInt();
		int pcard = player.generateRandomInt();

		
		System.out.println("Player has drawn value: " + pcard);
		System.out.println("Dealer has drawn value: " + dcard);
		
		
		if (pcard >21 && dcard > 21) {
			System.out.println("Both players are bust");
		}
		else if (pcard == 21 && dcard != 21) {
			System.out.println("Player wins with 21");
		}
		else if (dcard == 21 && pcard != 21) {
			System.out.println("Dealer wins with 21");
		}
		else if (pcard == dcard) {
			System.out.println("Draw, Dealer wins");
		}
		else if (pcard > 21) {
			System.out.println("Player is bust");
		}
		else if (dcard >21) {
			System.out.println("Dealer is bust");
		}
		else if (pcard>dcard) {
			System.out.println("Player wins");
		}
		else if (dcard>pcard) {
			System.out.println("Dealer wins");
		}
	}
	
}
