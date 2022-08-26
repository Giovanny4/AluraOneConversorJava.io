package conversorMonedaTemperatura;

import javax.swing.*;

public class ConversorMT {

    public static void main(String[] args) {
        
        float numero, resultado;
        int pp = 1;
        do {
            String[] opciones = {"Moneda", "Temperatura"};
            String respuesta = (String) JOptionPane.showInputDialog(null, "Seleccione opción", "conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
            if (respuesta == "Moneda") {
                String[] op1 = {
                    "De Pesos(COP$) a Dolar(US$)", "De Pesos(COP$) a Euro(EUR€)",
                    "De Pesos(COP$) a Real(R$)", "De Pesos(COP$) a Pesos(ARS)",
                    "De Pesos(COP$) a Dolar(AUD)", "De Dolar(US) a Pesos(COP)",
                    "De Euro(EU€) a Pesos(COP)", "De Real(R$) a Pesos(COP)"
                };
                String moneda = (String) JOptionPane.showInputDialog(null, "seleccione la opcion", "Elija moneda a convertir", JOptionPane.QUESTION_MESSAGE, null, op1, 0);
                switch (moneda) {
                    case "De Pesos(COP$) a Dolar(US$)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(COP$) a Dolar(US$)"));
                        resultado = (float) (numero * 0.00023);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Pesos(COP$) a Euro(EUR€)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(COP$) a Euro(EUR€)"));
                        resultado = (float) (numero * 0.00023);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Pesos(COP$) a Real(R$)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(COP$) a Real(R$)"));
                        resultado = (float) (numero * 0.0011);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Pesos(COP$) a Pesos(ARS)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(COP$) a Pesos(ARS)"));
                        resultado = (float) (numero * 0.031);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Pesos(COP$) a Dolar(AUD)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(COP$) a Dolar(AUD)"));
                        resultado = (float) (numero * 0.00033);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                }
            } else if (respuesta == "Temperatura") {
                String[] op2 = {
                    "De Celsius(°C) a Fahrenheit(°F)", "De Celsius(°C) a Kelvin(K)",
                    "De Fahrenheit(°F) a Celsius(°C)", "De Fahrenheit(°F) a Kelvin(K)",
                    "De Kelvin(K) a Celsius(°C)", "De Kelvin(K) a Fahrenheit(°F)"
                };
                String temperatura = (String) JOptionPane.showInputDialog(null, "seleccione la opción", "Elija la temperatura a convertir", JOptionPane.QUESTION_MESSAGE, null, op2, 0);
                switch (temperatura) {
                    case "Celsius(°C) a Fahrenheit(°F)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "Celsius(°C) a Fahrenheit(°F)"));
                        resultado = (float) (numero * 33.8);
                        JOptionPane.showMessageDialog(null, resultado);
                        int p = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Celsius(°C) a Kelvin(K)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Celsius(°C) a Kelvin(K)"));
                        resultado = (float) (numero * 274.15);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Fahrenheit(°F) a Celsius(°C)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Fahrenheit(°F) a Celsius(°C)"));
                        resultado = (float) (numero * (-17.2222222));
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Fahrenheit(°F) a Kelvin(K)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Fahrenheit(°F) a Kelvin(K)"));
                        resultado = (float) (numero * 255.927778);
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Kelvin(K) a Celsius(°C)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Kelvin(K) a Celsius(°C)"));
                        resultado = (float) (numero * (-272.15));
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                    case "De Kelvin(K) a Fahrenheit(°F)":
                        numero = Float.valueOf(JOptionPane.showInputDialog(null, "De Kelvin(K) a Fahrenheit(°F)"));
                        resultado = (float) (numero * (-457.87));
                        JOptionPane.showMessageDialog(null, resultado);
                        pp = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?");
                        break;
                }
            }
        } while (pp == 1);
    }
}
