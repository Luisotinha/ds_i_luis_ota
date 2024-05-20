package Aula_04;
import javax.swing.*;
public class Imc {
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual seu nome?");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
     
        String classificação = "";

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            classificação = "Abaixo do peso";
        } else if (imc <= 24.9) { 
            classificação = "Peso Ideal";
        } else if (imc <= 29.9) {
            classificação = "Acima do peso";
        } else if (imc <= 34.9) {
            classificação = "Obesidade grau I";
        } else if (imc <= 39.9) {
            classificação = "Obesidade grau II";
        } else if (imc >= 40) {
            classificação = "Obesidade grau III";
        }

        String output = "O imc de " + name + " é: IMC = " + imc + "\nClassificação: " + classificação;
        JOptionPane.showMessageDialog(null, output);
    }
}
