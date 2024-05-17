package Entornos.ProyectoPatronDeDiseño;

// Esta clase la utilizaremos para manejar el flujo de datos de las clases que se modificarán a través de la clase de memento
public class Originator {
    // Una variable sobre la que agarraremos instancias de la clase personaje como estados
    Personaje estado;

    // Definimos el estado actual
    public void setEstado(Personaje estado){
        this.estado = estado;
    }

    // Obtener el estado actual
    public Personaje getEstado(){
        return estado;
    }

    // Guardar el estado actual - Se utilizará para almacenar cosas en el arraylist de caretaker
    public Memento guardar(){
        return new Memento(estado);
    }

    // Restaurar un estadio previo - Se utilizará para restaurar cosas a través del arraylist de caretaker
    public void restaurar(Memento m){
        this.estado = m.getEstado();
    }

}
