import excepciones.*;
import modelo.*;
import estados.*;

import org.junit.Assert;
import org.junit.Test;

import excepciones.DineroInsuficienteException;

public class Prueba07Test {

	@Test
	public void test00JugadorNoTieneDineroSuficienteYNoPuedeMoverse() {
		Tablero untablero = Tablero.getInstance();
		Jugador unjugador = new Jugador("Player");
		unjugador.sumarDinero(-55001);
		
		untablero.agregarJugador(unjugador);
		untablero.moverJugador(unjugador, 5);
		untablero.moverJugador(unjugador, 1);
		untablero.moverJugador(unjugador, 1);
		
		Carcel unacarcel = (Carcel) untablero.obtenerCasillero(unjugador).getestado();
		
		try {
			unacarcel.pagarFianza(unjugador);
			Assert.assertEquals(null, unjugador.getDinero() );
		}
		catch(DineroInsuficienteException error){
			Assert.assertFalse(unjugador.puedeMoverse() );
		}
	}

	@Test
	public void test01JugadorNoTieneDineroSuficienteParaFianzaYNoPuedeMoverse() {
		Tablero untablero = Tablero.getInstance();
		Jugador unjugador = new Jugador("Player");
		unjugador.sumarDinero(-55001);
		
		untablero.agregarJugador(unjugador);
		untablero.moverJugador(unjugador, 5);
		untablero.moverJugador(unjugador, 1);
		
		Carcel unacarcel = (Carcel) untablero.obtenerCasillero(unjugador).getestado();
		
		try {
			unacarcel.pagarFianza(unjugador);
			Assert.assertEquals(null, unjugador.getDinero() );
		}
		catch(DineroInsuficienteException error){
			Assert.assertFalse(unjugador.puedeMoverse() );
		}
	}
}
