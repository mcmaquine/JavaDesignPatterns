package br.com.gof;

import br.com.gof.facade.Facade;
import br.com.gof.singleton.*;
import br.com.gof.strategy.*;

public class Test {
	public static void main( String[] args)
	{
		//Teste de instaciamento unico com design pattern - Padrao Singleton
		SingletonLazy lazy1 = SingletonLazy.getInstancia();
		System.out.println(lazy1);
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		System.out.println(lazy2);
		
		SingletonEager eager1 = SingletonEager.getInstancia();
		System.out.println(eager1);
		SingletonEager eager2 = SingletonEager.getInstancia();
		System.out.println(eager2);
		
		SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
		System.out.println(holder1);
		SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
		System.out.println(holder2);
		
		
		//Strategy
		
		Behavior def = new DefensiveBehavior();
		Behavior norm = new NormalBehavior();
		Behavior offen = new OffensiveBehavior();
		
		Robot rob = new Robot();
		rob.setBehave(norm);
		rob.move();
		rob.move();
		rob.setBehave(def);
		rob.move();
		rob.setBehave(offen);
		rob.move();
		rob.move();
		rob.move();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Matheus", "69067100");
		
	}
}
