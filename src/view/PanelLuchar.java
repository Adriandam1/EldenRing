package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelLuchar extends JPanel {

    public PanelLuchar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] clases = {"Guerrero", "Mago", "Explorador"};
        JComboBox comboBox1 = new JComboBox<>(clases);
        JComboBox comboBox2 = new JComboBox<>(clases);
        JPanel panelComboBox = new JPanel();
        panelComboBox.add(comboBox1);
        panelComboBox.add(comboBox2);
        add(panelComboBox);

        JButton botonLuchar = new JButton("Luchar");
        botonLuchar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String clase1 = (String) comboBox1.getSelectedItem();
                String clase2 = (String) comboBox2.getSelectedItem();

                String resultado = combatir(clase1, clase2);

                JOptionPane.showMessageDialog(PanelLuchar.this, resultado);
            }
        });
        add(botonLuchar);
    }

    private String combatir(String clase1, String clase2) {
        // Lógica para determinar el ganador del enfrentamiento
        // Se puede implementar de acuerdo a la lógica del juego "Elden Ring"
        return "Resultado del enfrentamiento entre " + clase1 + " y " + clase2;
    }
}
