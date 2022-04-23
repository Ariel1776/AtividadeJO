package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Faça um programa que receba 4 valores via teclado no modo gráfico.
        int[] lista;
        int valores;
        lista = new int[5];

        //Os outros 3 valores não poderão receber 0. Colocar consistência.
        do {

            for (int i = 1; i <= 4; i++) {
                //Tais dados devem ser convertidos para tipo numérico, inteiro ou double.
                valores = Integer.parseInt((JOptionPane.showInputDialog("Insira o " + i + "° número: ")));

                //O programa deverá encerrar apenas se o 1º valor digitado for 0.
                if (valores == 0) {
                    System.out.println("Programa Encerrado");
                    break;
                }
                lista[i] = valores;

                //- Teste antes de prosseguir.
                System.out.println(lista[i]);
            }
        }while(lista[2] == 0 || lista[3] == 0 || lista[4] == 0);

        //Apresente a média dos valores e inicie o programa.
        double media;
        media = (lista[1] + lista[2] + lista[3] + lista[4]) / 4;
        JOptionPane.showMessageDialog(null, "Sua média é: " + media);
    }
}
