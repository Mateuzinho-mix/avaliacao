package com.company;

import sun.security.ssl.Debug;

import java.util.Scanner;

class Ex01 {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("INFORME A QUANTIDADE DE NOTAS: ");
        int avaliacoes = a.nextInt();
        double media = 0;
        for (int i = 1; i<=avaliacoes; i++){
            System.out.println("INFORME A NOTA " + i);
            double nota = a.nextInt();
            media = media + nota;

        }
        media = media/avaliacoes;
        System.out.println("MEDIA FINAL: " + media);


    }
}
