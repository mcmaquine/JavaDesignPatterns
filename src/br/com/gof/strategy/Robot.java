package br.com.gof.strategy;

public class Robot {
	
	private Behavior behave;

	public void setBehave(Behavior behave) {
		this.behave = behave;
	}
	
	public void move()
	{
		behave.move();
	}
}
