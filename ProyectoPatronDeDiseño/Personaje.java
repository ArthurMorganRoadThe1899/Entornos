package Entornos.ProyectoPatronDeDiseño;

public class Personaje {
    String name;
    int age;
    String gender;
    String weapon;
    int savestate;
    // Intente hacerlo vía public, pero me dio conflicto de que no se guardaba y desisti por pereza xd //
    /*public Personaje(){}*/

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
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
        return "\u001B[32mNombre: " + name + "\u001B[31m | Edad: " + age + "\u001B[36m | Género: " + gender+ "\u001B[33m | Arma: " + weapon+ "\u001B[0m";
    }

    /*
    @Override
    public String toString(){
        return "\u001B[32mNombre: " + name + "\u001B[31m | Edad: " + age + "\u001B[36m | Género: " + gender+ "\u001B[33m | Arma: " + weapon+ "| Savestate: ["+savestate+"]\u001B[0m";
    }
    */
}
