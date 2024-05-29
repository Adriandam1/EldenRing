package view;/*Enunciado: Sistema de Gestión de Personajes en "Elden Ring"
Objetivo: Desarrollar una aplicación en Java para gestionar los personajes del videojuego "Elden Ring". Esta aplicación permitirá a los jugadores crear y personalizar personajes, además de simular enfrentamientos entre ellos basándose en sus habilidades y atributos.

Requisitos:

Interfaz Gráfica: Utilizar Java Swing para crear una interfaz gráfica que permita a los usuarios crear un nuevo personaje, seleccionar entre diferentes tipos (por ejemplo, Guerrero, Mago, Explorador), y asignar puntos de habilidad (como fuerza, agilidad, inteligencia).

Clases de Personajes: Implementar una jerarquía de clases con polimorfismo que refleje los diferentes tipos de personajes en "Elden Ring". Cada clase de personaje tendrá métodos y atributos específicos.

Simulación de Enfrentamientos: Permitir a los usuarios simular enfrentamientos entre dos personajes, mostrando quién sería el ganador basado en sus atributos y habilidades. Utilizar polimorfismo para calcular el resultado del enfrentamiento dependiendo del tipo de personaje.

Gestión de Datos: Guardar y cargar configuraciones de personajes usando archivos de texto. Los usuarios deberían poder guardar su personaje y cargarlo posteriormente para modificarlo o simular un enfrentamiento
*/



import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Elder Ring");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));

        PanelCrear panelCrear = new PanelCrear();
        Border borderCrear = BorderFactory.createTitledBorder("Crear Personaje");
        panelCrear.setBorder(borderCrear);

        PanelLuchar panelLuchar = new PanelLuchar();
        Border borderLuchar = BorderFactory.createTitledBorder("Luchar");
        panelLuchar.setBorder(borderLuchar);

        panelPrincipal.add(panelCrear);
        panelPrincipal.add(panelLuchar);

        add(panelPrincipal);

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }

}