package model;

public class Guerrero implements Clase{


    public int fuerza = 18;
    public int agilidad = 7;
    public int inteligencia = 4;



    @Override
    public int getFuerza() {
        return 18;
    }

    public int getAgilidad() {
        return 7;
    }

    public int getInteligencia() {
        return 4;
    }

    @Override
    public String atacar() {
        return "Papel";
    }
}