package com.example;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class EstiloPersonalizado {
    public static void main(String[] args) {
        // Cambiar fuente por defecto
        UIManager.put("OptionPane.messageFont", new Font("Consolas", Font.BOLD, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Consolas", Font.PLAIN, 14));

        // Cambiar colores
        UIManager.put("Panel.background", new Color(30, 30, 30)); // Fondo gris oscuro
        UIManager.put("OptionPane.messageForeground", Color.GREEN); // Texto verde
        UIManager.put("Button.background", Color.DARK_GRAY);
        UIManager.put("Button.foreground", Color.WHITE);

        JOptionPane.showMessageDialog(null, "¡Este es un JOptionPane con estilo hacker!");
    }
}

