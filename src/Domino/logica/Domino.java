package Domino.logica;

import java.util.ArrayList;
import java.util.Random;

public class Domino {
	public ArrayList<Ficha> baraja;
	
	public Domino()
	{
		baraja = new ArrayList<Ficha>();
		
		for(int i=0; i<7; i++)
		{
			for(int j=i; j<7; j++)
			{
				baraja.add(new Ficha(i,j));
			}
		}
	}
	
	public void repartir(Jugador jugador) {
		int numeroFicha;
		Random rand = new Random();
		int tamanioBaraja = baraja.size();
		for(int f=tamanioBaraja; f>tamanioBaraja-7; f--)
		{
			numeroFicha = rand.nextInt(f);
			jugador.fichas.add(baraja.get(numeroFicha));
			baraja.remove(numeroFicha);
		}
	}
}
