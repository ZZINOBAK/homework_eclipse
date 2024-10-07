package com.homework.player;

public class FraudPlayer extends Player{
	String typeOfDice;

	public FraudPlayer(String name, int totalScore, String typeOfDice) {
		setName(name);
		setTotalScore(totalScore);
		this.typeOfDice = typeOfDice;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getTotalScore() {
		// TODO Auto-generated method stub
		return super.getTotalScore();
	}

	@Override
	public void setTotalScore(int totalScore) {
		// TODO Auto-generated method stub
		super.setTotalScore(totalScore);
	}

	public String getTypeOfDice() {
		return typeOfDice;
	}

	public void setTypeOfDice(String typeOfDice) {
        this.typeOfDice = typeOfDice;
    }

}
