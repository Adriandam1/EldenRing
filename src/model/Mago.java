package model;

public class Mago implements Clase{

    public int fuerza = 3;
    public int agilidad = 10;
    public int inteligencia = 20;



    @Override
    public int getFuerza() {
        return 3;
    }

    public int getAgilidad() {
        return 10;
    }

    public int getInteligencia() {
        return 20;
    }

    @Override
    public String atacar() {
        return "Piedra";
    }
}