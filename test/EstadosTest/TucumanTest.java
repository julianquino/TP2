package estados;

import org.junit.Assert;
import org.junit.Test;

import modelo.Casillero;
import modelo.Jugador.Jugador;
import modelo.Tablero;

public class TucumanTest {

	@Test
	public void test00ComprarTucumanReduceElDineroDelJugadorEn25000() {
		Tablero untablero = Tablero.getInstance();
		Jugador player = new Jugador("plauer");

        player.setEstado(player.getJugadorEmpezandoTurno());

		untablero.agregarJugador(player);
		
		untablero.moverJugador(player, 19);

		Casillero unacasilla = untablero.obtenerCasillero(player);
		Comprable unterreno = (Comprable) unacasilla.getestado();

		player.comprarTerreno(unterreno);
		
		Assert.assertEquals(75000, player.getDinero() );
	}

}