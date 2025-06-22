package com.example;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainGUI {
    static calculator calc = new calculator();

    public static void main(String[] args) {
        UIManager.put("OptionPane.messageFont", new Font("Consolas", Font.BOLD, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Consolas", Font.PLAIN, 14));

        UIManager.put("Panel.background", new Color(30, 30, 30)); // Fondo gris oscuro
        UIManager.put("OptionPane.messageForeground", Color.BLUE); // Texto verde
        UIManager.put("Button.background", Color.DARK_GRAY);
        UIManager.put("Button.foreground", Color.WHITE);
        
        boolean salir = false;

        while (!salir) {
            String menu = """
                    ------ CALCULADORA ------
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Potencias
                    6. Factorial
                    7. Raíz n-ésima
                    8. Conversor Decimal -> Binario
                    -1. Salir
                    """;

            String opcionStr = JOptionPane.showInputDialog(menu + "\nElige una opción:");
            if (opcionStr == null) break; // Si el usuario cancela

            int opcion;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
                continue;
            }

            try {
                double num1, num2;
                int num;
                double resultado;

                switch (opcion) {
                    case -1 -> salir = true;

                    case 1 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Primer número:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número:"));
                        resultado = calc.suma(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 2 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Minuendo:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Sustraendo:"));
                        resultado = calc.resta(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 3 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Primer número:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número:"));
                        resultado = calc.multiplicacion(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 4 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Dividendo:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Divisor:"));
                        resultado = calc.division(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 5 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Exponente:"));
                        resultado = calc.potencia(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 6 -> {
                        num = Integer.parseInt(JOptionPane.showInputDialog("Número para factorial:"));
                        resultado = calc.factorial(num);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 7 -> {
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Número base:"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Índice de raíz:"));
                        resultado = calc.raiz(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    }

                    case 8 -> { 
                        num = Integer.parseInt(JOptionPane.showInputDialog("Numero decimal: "));
                        String result = calc.binario(num);
                        JOptionPane.showMessageDialog(null, "Resultado: " + result);
                    }

                    default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de formato numérico.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error aritmético: " + e.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
    }
}
