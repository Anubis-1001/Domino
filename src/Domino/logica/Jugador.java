package Domino.logica;

import java.util.ArrayList;

public class Jugador {
	
	public ArrayList<Ficha> fichas;
	
	public Jugador(ArrayList<Ficha> fichas) {
		this.fichas = fichas ;
	}
	
	public Jugador() {
		this.fichas = new ArrayList<Ficha>();
	}
	
	public void ponerFicha(int i)
	{
		this.fichas.remove(i);
	}
	
	public void agregarFicha(Ficha ficha) {
			this.fichas.add(ficha);
	}
	
	
	public int hallarMayorDoble()
	{
		int indice = 0;
		int mayor=-1;
		Ficha ficha;
		this.fichas.add(0, new Ficha(-1, -1));
		for(int j=0; j<this.fichas.size(); j++)
		{
			ficha = fichas.get(j);
			if(ficha.ptosArriba == ficha.ptosAbajo && ficha.ptosArriba > mayor)
			{
				mayor = ficha.ptosAbajo;
				indice = j;
			}
		}
		
		return indice;
	}
	
	
	public void imprimirFichas()
	{
		for(int i=0; i<fichas.size(); i++)
		{
			System.out.print(fichas.get(i).ptosAbajo+"|"+fichas.get(i).ptosArriba+"    ");
		}
	}
	
}
