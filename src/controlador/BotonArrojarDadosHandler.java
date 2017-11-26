package controlador;

import java.util.HashMap;

import excepciones.JugadorYaTiroDados;
import excepciones.NoEsTurnoJugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.AlgoPoly;
import modelo.Jugador.Jugador;
import vista.JugadorCapa;

public class BotonArrojarDadosHandler implements EventHandler<ActionEvent> {

	private AlgoPoly algopoly;
	private HashMap<Jugador, JugadorCapa> hash;

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Arrojar dados");
		try {
			Jugador actual = this.algopoly.obtenerJugadorActual();
			this.algopoly.usarTurno(actual);
			JugadorCapa capa = hash.get(actual);
			capa.actualizar();
		} catch (NoEsTurnoJugador | JugadorYaTiroDados e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BotonArrojarDadosHandler(AlgoPoly unalgopoly, HashMap<Jugador, JugadorCapa> hash) {
		this.algopoly = unalgopoly;
		this.hash = hash;
	}

}
