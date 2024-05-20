package Entornos.ProyectoPatronDeDiseño.tekkeameEsta;

public class Personaje {
    String name;
    int health;
    String gender;
    boolean rage;
    int savestate;
    // Intente hacerlo vía public, pero me dio conflicto de que no se guardaba y desisti por pereza xd //
    /*public Personaje(){}*/

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setRage(boolean rage){
        this.rage = rage;
    }

    // Esto de acá es pura chumina', sirve básicamente para tener un punto de referencía del checkpoint actual xd
    public void setSaveState(int savestate){
        this.savestate = savestate;
    }
    public int getSavestate(){
        return savestate;
    }

    @Override
    public String toString(){
        return "Nombre: " + name + " | Vida restante: " + health + " | Género: " + gender+ " | Rage: " + rage+ " | Savestate: ["+savestate+"]";
    }

    /*
    @Override
    public String toString(){
        return "\u001B[32mNombre: " + name + "\u001B[31m | Edad: " + age + "\u001B[36m | Género: " + gender+ "\u001B[33m | Arma: " + weapon+ "| Savestate: ["+savestate+"]\u001B[0m";
    }
    */
}
