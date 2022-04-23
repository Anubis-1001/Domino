package Domino.logica;

public class Ficha {
	
	//Los puntos que tiene el dominó en cada lado
	//cambiar todo a private luego
	public int ptosArriba;
	public int ptosAbajo;
	
	public Ficha(int ptosArriba, int ptosAbajo) {
		this.ptosAbajo = ptosAbajo;
		this.ptosArriba = ptosArriba;
		
	}
	
	public int getPtosArriba()
	{
		return ptosArriba;
	}
	
	public int getPtosAbajo()
	{
		return ptosAbajo;
	}
	
}
