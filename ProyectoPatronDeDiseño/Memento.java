package Entornos.ProyectoPatronDeDiseño;

// Esta es la clase donde se maneja el flujo de estados y se pasan entre originator y caretaker para guardarlos
public class Memento {

    // Una variable sobre la que agarraremos instancias de la clase personaje como estados
    Personaje estado;

    // Agarramos la instancia de estado de la clase memento para tenerlo como un valor que pasar a originator
    public Memento(Personaje estado){
        this.estado = estado;
    }

    // Por si nos hace falta pillar el estado actual o pasarlo como valor
    public Personaje getEstado(){
        return estado;
    }
}
