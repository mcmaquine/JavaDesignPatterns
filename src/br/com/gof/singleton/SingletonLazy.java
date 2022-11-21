package br.com.gof.singleton;

/**
 * 
 * @author maquine
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if( instancia == null ) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
}
