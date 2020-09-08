package com.qa.blackjackmaven;

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
		cardCheck(pcard, dcard);
		//System.out.println(cardCheck(pcard,dcard));
	}
		
	public int cardCheck(int pcard, int dcard) {
		int result = 0;
		if (pcard >21 && dcard > 21) {
			System.out.println("Both players are bust");
			result = 0;
		}
		else if (pcard == 21 && dcard != 21) {
			System.out.println("Player wins with 21");
			result = 1;
		}
		else if (dcard == 21 && pcard != 21) {
			System.out.println("Dealer wins with 21");
			result = 2;
		}
		else if (pcard == dcard) {
			System.out.println("Draw, Dealer wins");
			result = 2;
		}
		else if (pcard > 21) {
			System.out.println("Player is bust");
		}
		else if (dcard >21) {
			System.out.println("Dealer is bust");
		}
		else if (pcard>dcard) {
			System.out.println("Player wins");
			result = 1;
		}
		else if (dcard>pcard) {
			System.out.println("Dealer wins");
			result =  2;
		}
		return result;
		
	
	}

		
}
	
