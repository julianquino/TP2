package Entrega2;

import estados.Comprable.Comprable;
import excepciones.NoEsTurnoJugador;
import modelo.Jugador.Jugador;
import modelo.Tablero;
import org.junit.Assert;
import org.junit.Test;

public class Prueba213Test {

    @Test
    public void test01JugadorVendePropiedadYTransfiereTitularidad(){

        Tablero untablero = Tablero.getInstance();
        untablero.resetearTablero();

        Jugador player1 = new Jugador("Vendedor");
        Jugador player2 = new Jugador("Comprador");
        Jugador player3 = new Jugador("Inquilino");

        untablero.agregarJugador(player1);
        untablero.agregarJugador(player2);
        untablero.agregarJugador(player3);

        player1.setEstado(player1.getJugadorEmpezandoTurno());

        player1.comprarTerreno(untablero.getEdesur());

        player1.vender(player2, untablero.getEdesur());

        player3.setValorDados(3);

        untablero.moverJugador(player3,3);

        Assert.assertEquals(10500, player2.getDinero());
    }
}