package br.com.caioMartins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        int somaNumeros = 0;
        double media = 0;

        do {
            System.out.println("Informe um número inteiro (0 para sair): ");
            numero = entrada.nextInt();

            if (numero > 0){
                qtdPositivos++;
                somaNumeros = somaNumeros + numero;
            } else if (numero < 0) {
                qtdNegativos++;
                somaNumeros = somaNumeros + numero;
            }

        } while (numero != 0);

        if ((qtdPositivos+qtdNegativos) != 0){
            media = (double) somaNumeros/(qtdPositivos+qtdNegativos);
        }

        System.out.println("A quantidade de números positivos é: " + qtdPositivos);
        System.out.println("A quantidade de números negativos é: " + qtdNegativos);
        System.out.println("A soma dos números lidos é: " + somaNumeros);
        System.out.println(String.format("A média aritimética é: %,.2f", media));

    }
}
