package modelo;
import estados.Terreno;
import excepciones.JugadorYaTiroDados;
import excepciones.NoEsTurnoJugador;

public class JugadorEmpezandoTurno implements EstadoDeJugador {

    Jugador jugador;

    public JugadorEmpezandoTurno(Jugador unJugador){

        jugador = unJugador;
    }


    public void arrojarDados() throws NoEsTurnoJugador, JugadorYaTiroDados {

        int resultado = resultadoDados();

        if(resultado == 0){
            resultado = resultadoDados();
        }

        if(resultado == 0){
            jugador.setEstado(jugador.getJugadorSinTurno());
        }else {
            jugador.setEstado(jugador.getJugadorTiroDados());
            jugador.setValorDados(resultado);
        }



    }

    public void comprar(Terreno unTerreno) throws NoEsTurnoJugador {
        //if(! unterreno.tieneDuenio() )
        jugador.adquirirPropiedad(unTerreno);
        unTerreno.cambiarDuenio(jugador);
        unTerreno.pagarCompra(jugador);
    }

    public void pagar(){
        System.out.println("no puede");
    }

    public void pasarTurno(){
        System.out.println("no tiro dados");
    }

    private int resultadoDados(){

        int valordado1;
        int valordado2;

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        valordado1 = dado1.arrojar();
        valordado2 = dado2.arrojar();


        if(valordado1 == valordado2) {
            return 0;

        }else{
            return valordado1+valordado2;
        }
    }


}