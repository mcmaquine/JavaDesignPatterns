package br.com.gof.singleton;

/**
 * Singleton 'apressadinho'
 * @author maquine
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager()
	{
		super();
	}
	
	public static SingletonEager getInstancia()
	{
		return instancia;
	}
}
