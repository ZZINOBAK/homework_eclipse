package com.homework.jusawigame;

import java.util.List;

import com.homework.player.FraudPlayer;
import com.homework.player.Player;

public class Recoder {
	public void totalScore(Player player, int roll) {
	    int score = player.getTotalScore();
	    player.setTotalScore(score + roll);
	}
	
	public void printStatus(List<Player> players) {
		System.out.print("[ ");
		for (Player player : players) {
			if (player instanceof FraudPlayer) {
				FraudPlayer fraudPlayer = (FraudPlayer) player;  // 다운캐스팅
				System.out.print(player.getName() +
						":" + player.getTotalScore() + "[" +
						fraudPlayer.getTypeOfDice() + "] ");
			} else {
				System.out.print(player.getName() +
						":" + player.getTotalScore() + " ");
			}
		}
		System.out.println("]");
	}
}
