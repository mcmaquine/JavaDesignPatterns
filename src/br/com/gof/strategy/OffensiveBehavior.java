package br.com.gof.strategy;

public class OffensiveBehavior implements Behavior {

	@Override
	public void move() {
		System.out.println("Moving offensive");
	}

}
