package bowler;

import java.util.ArrayList;
import java.util.Scanner;

public class BowlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bob = new Scanner(System.in);
		ArrayList<Bowler> poopie = new ArrayList<Bowler>();
		System.out.println("Enter the number of bowlers:");
		int numberBowler = bob.nextInt();
		System.out.println("Enter the number of games played:");
		int numberofGamesPlayed = bob.nextInt();
		for (int i = 0; i < numberBowler; i++) {
			int finish = 0;
			
			System.out.println("Enter name for Bowler:");
			bob.nextLine();
			String bowlerName = bob.nextLine();
			
			Bowler man = new Bowler(bowlerName);
			poopie.add(man);
			
			for (int x = 1; x <= numberofGamesPlayed;x++) {
				System.out.println("Enter score of round "+ x + " for " + bowlerName);
				int Score = bob.nextInt();
				finish += Score;
				}
			man.addScore(finish, numberofGamesPlayed);
			}
		for(Bowler bowler: poopie) {
		System.out.println("The average score for " + bowler.getName() + " was " + bowler.getScoreAvg()+".");
		}
		
	}
}
