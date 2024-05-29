package model;

public class Explorador implements Clase {

    public int fuerza = 8;
    public int agilidad = 15;
    public int inteligencia = 7;



    @Override
    public int getFuerza() {
        return 8;
    }

    public int getAgilidad() {
        return 15;
    }

    public int getInteligencia() {
        return 7;
    }

    @Override
    public String atacar() {
        return "Piedra";
    }
}