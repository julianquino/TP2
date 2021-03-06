package estados.Comprable;

import excepciones.DineroInsuficiente;
import modelo.Jugador.Jugador;

public class ComprableNoTieneDuenio implements ComprableEstado {


    Comprable comprable;


    public ComprableNoTieneDuenio(Comprable unComprable){
        comprable = unComprable;
    }


    public void hacerEfectoDelCasillero(Jugador unJugador) {
        return;
    }



    public void reembolsar(){
        System.out.print("no tiene duenio");
    }

    public void comprar(Jugador unjugador) throws DineroInsuficiente {

        if(!unjugador.puedePagar(this.comprable.getPrecioCompra())) throw new DineroInsuficiente();
        unjugador.sumarDinero(this.comprable.getPrecioCompra()*-1);
        comprable.setDuenio(unjugador);
        comprable.setEstado(comprable.getTieneDuenio());
    }

    public void cobrarPase(Jugador unJugador){
        System.out.print("no tiene duenio");
    }


    public String getMensaje(Jugador unJugador) {
        return comprable.getNombre() + " no tiene propietario" + "\n" +"Desea comprarlo por $" + comprable.getPrecioCompra() +"?";
    }



    public Jugador getDuenio(){
        return null;
    }

    public boolean tieneDuenio(){
        return false;
    }


}
