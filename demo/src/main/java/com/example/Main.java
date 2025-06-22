package com.example;
import java.util.Scanner;

public class Main {
    String line = "------------------------------------------------------------------------";
    String menu = """
                    ------------------------------------------------------------------------
                    \n\t\t\tARSLAN'S CALCULATOR\n
                    ------------------------------------------------------------------------
                    \n\tHerramientas:\n
                    1. Suma\n
                    2. Resta\n
                    3. Multiplicacion\n
                    4. Division\n
                    5. Potencias\n
                    6. Factorial\n
                    7. Raiz a la n potencia\n
                    -1. Salir (Exit)
                    ------------------------------------------------------------------------""";
    String request = "Ingrese la operacion que desee usar (1-7) >>> ";
    double dnumero1, dnumero2, result;
    int opcion = 0, inumero;
    boolean exit = false;
    calculator calc = new calculator();
    Scanner scan;

    void entrada(){
        scan = new Scanner(System.in);
        do { 
            System.out.println(menu);
            System.out.print(request);
            opcion = scan.nextInt();
            switch (opcion) {
                case -1:
                    exit = true;
                    break;
                case 1:
                    System.out.print("Ingrese los numeros a sumar: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print(" + ");
                    dnumero2 = scan.nextDouble();
                    result = calc.suma(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;
                case 2:
                    System.out.print("Ingrese los numeros a restar: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print(" - ");
                    dnumero2 = scan.nextDouble();
                    result = calc.resta(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;
                case 3:
                    System.out.print("Ingrese los numeros a multiplicar: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print(" * ");
                    dnumero2 = scan.nextDouble();
                    result = calc.multiplicacion(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;
                case 4:
                    System.out.print("Ingrese los numeros a dividir: \nDividendo: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print("\n Divisor: ");
                    dnumero2 = scan.nextDouble();
                    result = calc.division(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;

                case 5: 
                    System.out.print("Ingrese el numero que desee elevar a una potencia: \nBase: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print("\nExponente: ");
                    dnumero2 = scan.nextDouble();
                    result = calc.potencia(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;

                case 6: 
                    System.out.print("Ingrese el numero que desee calcular su factorial: ");
                    inumero = scan.nextInt();
                    int result1 = calc.factorial(inumero);
                    System.out.println(line + "\nResultado: " + result1);
                    break;

                case 7:
                    System.out.print("Ingrese los numeros de la raiz a calcular: \nBase: ");
                    dnumero1 = scan.nextDouble();
                    System.out.print("\nRaiz: ");
                    dnumero2 = scan.nextDouble();
                    result = calc.raiz(dnumero1, dnumero2);
                    System.out.println(line + "\nResultado: " + result);
                    break;
            }
        } while (!exit);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.entrada();
    }
}