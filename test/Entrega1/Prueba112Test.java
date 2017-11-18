
import modelo.Jugador.Jugador;
import org.junit.Test;
import org.junit.Assert;
import modelo.*;

public class Prueba112Test {

	@Test
	public void test00JugadorCaeEnPoliciaSeEnviaALaCarcelYNoPuedeMoverse() {
		Tablero untablero = Tablero.resetInstance();
		Jugador unjugador = new Jugador("Player");

		unjugador.setEstado(unjugador.getJugadorEmpezandoTurno());
		untablero.agregarJugador(unjugador);
		
		untablero.moverJugador(unjugador, 15);		
		
		Assert.assertFalse(unjugador.puedeMoverse() );
	}

}
