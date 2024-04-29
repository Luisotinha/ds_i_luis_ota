package Aula_04;
import javax.swing.*;
public class Swing {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual seu nome?");
        String output = name + " nome de pessoa bonita.";
        JOptionPane.showMessageDialog(null, output);
    }
}