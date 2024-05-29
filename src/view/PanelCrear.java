package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCrear extends JPanel {

    private JComboBox<String> comboBox;
    private JTextField campoNombre;
    private JSpinner fuerzaSpinner;
    private JSpinner agilidadSpinner;
    private JSpinner inteligenciaSpinner;

    public PanelCrear() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] clases = {"Guerrero", "Mago", "Explorador"};
        comboBox = new JComboBox<>(clases);
        add(comboBox);

        campoNombre = new JTextField("Nombre");
        add(campoNombre);

        fuerzaSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        agilidadSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        inteligenciaSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        JPanel panelAtributos = new JPanel();
        panelAtributos.add(new JLabel("Fuerza:"));
        panelAtributos.add(fuerzaSpinner);
        panelAtributos.add(new JLabel("Agilidad:"));
        panelAtributos.add(agilidadSpinner);
        panelAtributos.add(new JLabel("Inteligencia:"));
        panelAtributos.add(inteligenciaSpinner);
        add(panelAtributos);

        JButton botonCrear = new JButton("Crear Personaje");
        botonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                String claseSeleccionada = (String) comboBox.getSelectedItem();
                int fuerza = (Integer) fuerzaSpinner.getValue();
                int agilidad = (Integer) agilidadSpinner.getValue();
                int inteligencia = (Integer) inteligenciaSpinner.getValue();

                // Aquí se podría instanciar y guardar el personaje
                JOptionPane.showMessageDialog(null, "Personaje creado:\n" +
                        "Nombre: " + nombre + "\n" +
                        "Clase: " + claseSeleccionada + "\n" +
                        "Fuerza: " + fuerza + "\n" +
                        "Agilidad: " + agilidad + "\n" +
                        "Inteligencia: " + inteligencia);
            }
        });
        add(botonCrear);
    }
}
