package Entrega2;

import modelo.Jugador.Jugador;
import modelo.Tablero;
import org.junit.Assert;
import org.junit.Test;

public class Prueba211Test {

    @Test
    public void test01JugadorCaeEnTrenConDuenio() throws Exception {

        Tablero untablero = Tablero.getInstance();
        untablero.resetearTablero();

        Jugador player = new Jugador("Player");
        player.setEstado(player.getJugadorEmpezandoTurno());
        untablero.agregarJugador(player);

        player.comprar(untablero.getTren());


        Jugador player2 = new Jugador("Player2");
        player2.setEstado(player.getJugadorEmpezandoTurno());

        untablero.agregarJugador(player2);

        player2.setValorDados(6);

        untablero.moverJugador(player2,16);
		Tablero.getInstance().obtenerCasillero(player2).getestado().hacerEfectoDelCasillero(player2);
		

        Assert.assertEquals(100000 - player2.getValorDados()*450, player2.getDinero());


    }


}
