package Entornos.ProyectoPatronDeDiseño;

public class App {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Definimos objetos de la clase personaje como ejemplo...
        Personaje pj = new Personaje();
        pj.setName("Sora");
        pj.setAge(16);
        pj.setGender("Male");
        pj.setWeapon("Keyblade");

        // Guardamos sus datos
        //pj.setSaveState(1);
        originator.setEstado(pj);
        caretaker.addMemento(originator.guardar());

        // Mostramos la información de los datos del personaje
        System.out.println(pj.toString());

        // Ahora vamos a probar a haccer un cambio de estado a la variable pj //
        // ! HAS DE INSTANCIAR CADA VEZ QUE LO HAGAS PARA GUARDAR EL ESTADO ! //
        pj = new Personaje();
        // Datos nuevos... //
        pj.setName("Kairi");
        pj.setAge(15);
        pj.setGender("Female");
        pj.setWeapon("Keyblade");

        // Guardamos sus datos
        //pj.setSaveState(2);
        originator.setEstado(pj);
        caretaker.addMemento(originator.guardar());

        // Y mostramos en pantalla que se haya guardado correctamente
        System.out.println(pj.toString());

        // Este esta parte del código es para regresar pj a, en esta ocasión, su primer estado, que era el de Sora
        originator.restaurar(caretaker.getMemento(0));
        pj = originator.getEstado();
        System.out.println("\n\nSavestate back: ");
        System.out.println(pj.toString());
    }
}
