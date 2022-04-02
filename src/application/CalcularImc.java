package application;

import java.util.Scanner;

public class CalcularImc {
    public static void calcularImc() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe seu peso em kg: ");
            Float peso = sc.nextFloat();

            System.out.print("Informe sua altura: ");
            Float altura = sc.nextFloat();

            System.out.print("Informe seu sexo (H/M): ");
            String sexo = sc.next().toUpperCase();

            Float imcFinal = (peso) / (altura*altura);

            if (imcFinal < 19.1 && sexo.equals("M")) {
                System.out.println("Abaixo do peso");
            }
            if (imcFinal < 20.7 && sexo.equals("H")) {
                System.out.println("Abaixo do peso");
            }
            if (imcFinal > 19.1 && imcFinal < 25.8 && sexo.equals("M")) {
                System.out.println("Peso normal");
            }
            if (imcFinal > 20.7 && imcFinal < 26.4 && sexo.equals("H")) {
                System.out.println("Peso normal");
            }
            if (imcFinal > 25.8 && imcFinal < 27.3 && sexo.equals("M")) {
                System.out.println("Marginalmente acima do peso");
            }
            if (imcFinal > 26.4 && imcFinal < 27.8 && sexo.equals("H")) {
                System.out.println("Marginalmente acima do peso");
            }
            if (imcFinal > 27.3 && imcFinal < 32.3 && sexo.equals("M")) {
                System.out.println("Acima do peso ideal");
            }
            if (imcFinal > 27.8 && imcFinal < 31.1 && sexo.equals("H")) {
                System.out.println("Acima do peso ideal");
            }
            if (imcFinal > 32.3 && sexo.equals("M")) {
                System.out.println("Obeso");
            }
            if (imcFinal > 31.1 && sexo.equals("H")) {
                System.out.println("Obeso");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}