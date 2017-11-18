import modelo.*;
import modelo.Jugador.Jugador;
import org.junit.Assert;
import org.junit.Test;


public class Prueba101Test {

	@Test
	public void test(){
		Tablero tablero = Tablero.getInstance();
		Jugador jugador = new Jugador("jugador1");
		tablero.agregarJugador(jugador);
		tablero.moverJugador(jugador, 1);
		
		Assert.assertEquals(150000,jugador.getDinero());
	}

}
