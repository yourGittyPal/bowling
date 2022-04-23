package bowler;

public class Bowler {
	//instance variables
	private String name;
	private int totalPoints = 0;
	private int gamesPlayed = 0;
	
	Bowler(String name){
		this.name = name;
	}
	
	public void setGames(int gamesEX) {
		this.gamesPlayed = gamesEX;
	}
	
	public void addScore(int score, int gamesPlayed) {
		this.totalPoints = score; 
		this.gamesPlayed = gamesPlayed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScoreAvg() {
		return totalPoints/gamesPlayed;
	}
	
	
}
