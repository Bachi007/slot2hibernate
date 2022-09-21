package com.slot2hibernate;
//inheritance
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bowler")
public class bowler extends teamindia{

	private String bowlingHand;
	private String bestFigures;
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestFigures() {
		return bestFigures;
	}
	public void setBestFigures(String bestFigures) {
		this.bestFigures = bestFigures;
	}
	@Override
	public String toString() {
		return "bowler [bowlingHand=" + bowlingHand + ", bestFigures=" + bestFigures + "]";
	}
	
	
	
}
