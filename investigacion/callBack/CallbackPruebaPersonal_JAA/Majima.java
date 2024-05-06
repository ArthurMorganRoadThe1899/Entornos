public class Majima {
    // Creo una variable basada en la interfaz Retroflama...
    private Retroflama retroflama;

    // Esto para después agarrar la variable de la interfaz que he creado en el hijo a mi entender.
    public Majima(Retroflama retroflama) {
        this.retroflama = retroflama;
    }

    // Interesting, acá llamo a la variable de la interfaz que he creado a través del void de la propia interfaz, entiendo que para sobreescribirlo después en el hijo xD
    public void yijahh(){
        retroflama.yoKiryuChan();
    }
}
