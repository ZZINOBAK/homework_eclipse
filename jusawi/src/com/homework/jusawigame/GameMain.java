package com.homework.jusawigame;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Judge judge = new Judge();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------");
	    System.out.println("웰컴투 주사위 게임");
		System.out.println("---------------------------------------------------------");

		Judge judge1 = new Judge();

		for (int i = 1; i <= i+1; i++) {
		    System.out.print("이름 : ");
		    String name = scanner.next();
		    System.out.print("일반은 1번 사기는 2번 : ");
		    int type = scanner.nextInt();
		    judge.registration(name, type);
	    	//이름이 같을 때 이름 옆에 숫자를 자동으로 추가해주기.
		    if(i<2) {
			    System.out.println("플레이어 한명더 ㄱㄱ");
		    } else {
			    System.out.println("게임 시작하려면 1번 입력, 플레이어 추가하려면 2번 입력");
			    System.out.print("입력 : ");
			    int choose = scanner.nextInt();
			    if(choose == 1) {
			    	break;
			    }
		    }
	    }
	    
	    System.out.println("주사위 던지는 횟수는 5로 하겠다.");
		System.out.println();

		judge.gameStart(5);
		judge.winner();

	}
}
