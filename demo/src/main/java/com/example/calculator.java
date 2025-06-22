package com.example;
public class calculator {
    public double suma(double a, double b){
        double result = a+b;
        return result;
    }

    public double resta(double a, double b){
        double result = a-b;
        return result;
    }

    public double multiplicacion(double a, double b){
        double result = a*b;
        return result;
    }

    public double division(double dividendo, double divisor){
        double result;
        if (divisor == 0){
            throw new ArithmeticException("División entre cero");
        }
        else {
            result = dividendo/divisor;
        }
        return result;
    }

    public double potencia(double base, double exponente){
        double result = 0;
        if(exponente < 0){
            result = 1.0/(Math.pow(base, exponente));
        }
        else if (exponente == 0){
            result = 1;
        }
        else if (exponente > 0){
            result = Math.pow(base, exponente);
        }

        return result;
    }

    public int factorial(int base){
        int result = base;
        if(base == 0){
            result = 1;
        }
        else if(base < 0){
            throw new ArithmeticException("Factorial de numero negativo.");
        }
        else if (base > 0){
            for(int i = base; i > 1; i--){
                result *= (i-1);
            }
        }
        return result;
    }

    public double raiz(double base, double exponente){
        double raiz = 1/exponente;
        double result;
        result = Math.pow(base, raiz);
        return result;
    }

    public String binario(int decimal){
        String result = Integer.toBinaryString(decimal);
        return result;
    }
}
