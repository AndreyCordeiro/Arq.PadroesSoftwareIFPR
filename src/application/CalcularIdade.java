package application;

import javax.swing.*;

public class CalcularIdade {
    public static void calcAge( ) {
        try {
            Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: "));

            if (idade < 0) {
                System.out.println("Você não pode ter idade negativa!");
            } else if (idade <= 12) {
                System.out.println("Criança");
            } else if (idade > 12 && idade <= 18) {
                System.out.println("Adolescente");
            } else if (idade > 18 && idade <= 60) {
                System.out.println("Adulto");
            } else if (idade > 60 && idade <= 105) {
                System.out.println("Idoso");
            } else if (idade > 105) {
                System.out.println("Provavelmente você está mentindo!");
            } else {
                System.out.println("Inválido");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!");
        }
    }
}