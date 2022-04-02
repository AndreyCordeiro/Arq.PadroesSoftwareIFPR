package application;

import javax.swing.*;

public class SepararValores {
    public static void separeteValues() {
        try {
            String idade = JOptionPane.showInputDialog("Informe valores separados por vírgula: ");
            String[] strArray = idade.split(",");

            reverseValues(strArray);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void reverseValues(String[] value) {
        String endValues = "";

        for (int i = value.length - 1; i >= 0; i--) {
            if (endValues.length() == 0) {
                endValues = value[i];
            } else {
                endValues += ", " + value[i];
            }
        } System.out.print(endValues);
    }
}