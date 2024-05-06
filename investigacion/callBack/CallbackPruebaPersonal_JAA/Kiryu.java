public class Kiryu {
    public static void main(String[] args) {

        // Ma' o meno' entiendo la estructura, creo una variable de Retroflama a través de Majima que ha agarrado de su parte
        // ya las cosas de Retroflama pa' hacer lo del callback.
        Majima amenaza = new Majima(new Retroflama() {

            // Sobreescribo el método de call de Retroflama con un mensaje...
            @Override
            public void yoKiryuChan() {
                System.out.println("KIRYUUUUUU-CHAAAAAAAAAN\n" +
                                   "Recomendación: No siempre es obligatorio combatir, y más contra el\n" +
                                   "capitan de la familia Majima, suerte :)");

            }
        });

        // Y lo llamo a través del yijahh, que este a su vez llama al yoKiryuChan al ejecutarlo xD
        amenaza.yijahh();
    }
}
