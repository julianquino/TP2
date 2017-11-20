package Entrega2;

import modelo.Jugador.Jugador;
import modelo.Tablero;
import org.junit.Assert;
import org.junit.Test;

public class Prueba217Test {

    @Test
    public void test01JugadorCaeEnEdesurYDuenioTieneAysa(){

        Tablero untablero = Tablero.getInstance();
        untablero.resetearTablero();

        Jugador player = new Jugador("Player");
        player.setEstado(player.getJugadorEmpezandoTurno());
        untablero.agregarJugador(player);

        player.comprarTerreno(untablero.getEdesur());
        player.comprarTerreno(untablero.getAysa());


        Jugador player2 = new Jugador("Player2");
        player2.setEstado(player.getJugadorEmpezandoTurno());

        untablero.agregarJugador(player2);

        player2.setValorDados(6);

        untablero.moverJugador(player2,3);

        Assert.assertEquals(100000 - player2.getValorDados()*1000, player2.getDinero());


    }


}
