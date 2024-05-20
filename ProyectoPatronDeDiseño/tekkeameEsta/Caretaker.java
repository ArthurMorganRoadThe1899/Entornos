package Entornos.ProyectoPatronDeDiseño.tekkeameEsta;
import java.util.ArrayList;

// Caretaker será la clase que utilizaremos para almacenar cualquier estado de otras clases a través de mementos
public class Caretaker {
    // Esto se hace a través de un arraylist de memento en el que agarraremos y almacenaremos objetos de otras clases
    ArrayList<Memento> mementoStates = new ArrayList<>();

    // Acá unos métodos de la propia clase PARA aprovechar el propio arraylist, almacenar y mostrar data xD
    public void addMemento(Memento m){
        mementoStates.add(m);
    }

    public Memento getMemento(int pick){
        return mementoStates.get(pick);
    }
}
