package com.homework.player;

public class Player {
	private String name;
	private int totalScore;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(String name, int totalScore) {
		this.name = name;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
}
