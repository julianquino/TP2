import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Prueba04Test {

	@Test
	public void test() {
		Tablero untablero = new Tablero();
		Jugador player = new Jugador("plauer");
		untablero.agregarJugador(player);
		
		untablero.moverJugador(player, 2);
		
		Casillero unacasilla = untablero.obtenerCasillero(player);
		Terreno unterreno = (Terreno) unacasilla.getestado();
		
		Assert.assertEquals(player, unterreno.preguntarDuenio() );
	}

}