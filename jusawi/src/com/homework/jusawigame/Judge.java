package com.homework.jusawigame;

import java.util.ArrayList;
import java.util.List;

import com.homework.dice.Dice;
import com.homework.dice.FraudDice;
import com.homework.player.FraudPlayer;
import com.homework.player.Player;

public class Judge {
	Recoder recoder = new Recoder();
    List<Player> players = new ArrayList<>();
	Dice dice = new Dice();
	FraudDice fraudDice = new FraudDice();
	
	public void registration(String name, int type) {
    	if(type == 1) {
    		players.add(new Player(name, 0));
    	} else {
    		players.add(new FraudPlayer(name, 0, "normal"));
    	}
	}
    
	public void gameStart(int rolls) {
		int roll;
		Player winningPlayer = players.get(0);
		Player losingPlayer =  players.get(0);

		int gap = 0;
		for (int i = 0; i < rolls; i++) {
			for (Player player : players) {
			    if (player instanceof FraudPlayer) {
			    	if (i != 0 && !winningPlayer.getName().equals(player.getName())) {
			            roll = fraudDice.rollStrong();
						((FraudPlayer) player).setTypeOfDice("Strong");
			        }  else if (i != 0 && gap >= 3) {
			            roll = fraudDice.rollWeak();
						((FraudPlayer) player).setTypeOfDice("Weak");
					} else {
			            roll = fraudDice.roll();
			        }
			    } else {
					roll = dice.roll();
			    }
				recoder.totalScore(player, roll);
			}
			
			for (Player player : players) {
				if (player.getTotalScore() > winningPlayer.getTotalScore()) {
					winningPlayer = player;
				} else if (player.getTotalScore() < losingPlayer.getTotalScore()) {
					losingPlayer = player;
				}
			}
            
            if (winningPlayer instanceof FraudPlayer) {
            	gap = winningPlayer.getTotalScore()-losingPlayer.getTotalScore();
            } else {
            	gap = 0;
            }
            
			recoder.printStatus(players);
		}
	}
	
	public void winner() {
	    System.out.println();
	    System.out.println("승자를 기록합니다.");
	    System.out.println();

	    int winnerScore = 0;
	    Player winner = null;
	    for (Player player : players) {
	        if (player.getTotalScore() > winnerScore) {
	        	winnerScore = player.getTotalScore();
	            winner = player;
	        } else if (player.getTotalScore() == winnerScore) {
	        	winner = null;
	        }
	    }
		
	    if (winner != null) {
	        System.out.println(winner.getName() + "가(이) 승리했습니다!");
	    } else {
	        System.out.println("무승부");
	    }
		
	}
}
