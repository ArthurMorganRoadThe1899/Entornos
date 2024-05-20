package Entornos.ProyectoPatronDeDiseño.tekkeameEsta;

public class App {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // empezamos la ronda con un máximo definido de 125 por ejemplo
        Personaje pj = new Personaje();
        pj.setName("Kazuma Mishima");
        pj.setHealth(125);
        pj.setGender("Male");
        pj.setRage(false);
        pj.setSaveState(1);

        // guardamos el estado de como spawnea nada mas inicia la ronda
        originator.setEstado(pj);
        caretaker.addMemento(originator.guardar());

        System.out.println("\n\nRONDA 1: ");
        System.out.println(pj.toString());

        // esto se haría de manera dinamica, pero imaginemos, que ha recibido un golpetazo y se ha quedado a poca vida 20
        // y poco esta a poca vida, imaginemos que esta programado internamente, pero agarra y como la vida es menor del 25% agarra y se pone en modo rage
        pj = new Personaje();
        pj.setName("Kazuma Mishima");
        pj.setHealth(20); // Esto sería el 16% de la vida total (125)
        pj.setGender("Male");
        pj.setRage(true);
        pj.setSaveState(2);


        originator.setEstado(pj);
        caretaker.addMemento(originator.guardar());

        System.out.println("\n\nKazuya Mishima: OUCH");
        System.out.println("\n"+pj.toString());

        // ahora de repente, imaginemos que la ronda 2 empieza de golpe porque patata, evidentemente no va a spawnear con 20 de vida porque sería injusto
        originator.restaurar(caretaker.getMemento(0));
        pj = originator.getEstado();
        System.out.println("\n\nRONDA 2: ");
        System.out.println(pj.toString());
    }
}
