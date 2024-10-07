package com.homework.dice;

import java.util.Random;

public class Dice {
	Random random = new Random();

	public int roll() {
	    int randomNumber = random.nextInt(6)+ 1;
	    return randomNumber;
	}
}
