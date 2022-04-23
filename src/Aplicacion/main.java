package Aplicacion;

import Domino.logica.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domino juego = new Domino();
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		juego.repartir(jugador1);
		juego.repartir(jugador2);
		jugador1.imprimirFichas();
		System.out.println();
		jugador2.imprimirFichas();
		
		
		int mayorDoble1 = jugador1.hallarMayorDoble();
		int mayorDoble2 = jugador2.hallarMayorDoble();
//		if(jugador1.fichas.get(mayorDoble1).getPtosArriba()!=-1)
//		{
//			
//		}
//		
//		if(jugador1.fichas.get(mayorDoble1).getPtosArriba()!=-1)
//		{
//			
//		}
		
		System.out.println();
		System.out.println(jugador1.fichas.size());
		if(jugador1.fichas.get(mayorDoble1).getPtosArriba() > jugador2.fichas.get(mayorDoble2).getPtosAbajo())
		{
			System.out.println("la mayor doble pertenece al jugador 1 y esta en la posicion "+mayorDoble1);
		}
		else if (jugador1.fichas.get(mayorDoble1).getPtosArriba() < jugador2.fichas.get(mayorDoble2).getPtosAbajo())
		{
			System.out.println("la mayor doble pertenece al jugador 2 y esta en la posicion "+mayorDoble2);
		}
		else
		{
			System.out.println("Ninguno tiene doble");
		}
		
	}

}
