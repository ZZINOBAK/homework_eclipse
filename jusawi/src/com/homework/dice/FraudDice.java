package com.homework.dice;

public class FraudDice extends Dice{
	int result = 0;
	
	@Override
	public int roll() {
		return super.roll();
	}

	public int rollWeak() {
		result = roll();
	    while (result >= 5) {
	        result = roll();
	    }
	    return result;
	}
	
	public int rollStrong() {
		result = roll();
		while(result <= 2) {
	        result = roll();
		};
	    return result;
	}
}
