package com.calculadora;

import java.util.Scanner;  

public class calculadora {


    static int x,y;
    static int soma;
    static int subtracao;
    static int multiplicacao;
    static int divisao;


    public static void main(String[] args) {

      
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite o valor de x:");
        x = scanner.nextInt();

        System.out.print("Digite o valor de y:");
        y = scanner.nextInt();

        soma();
        subtracao();
        multiplicacao();
        divisao();

    }


    public static void soma( ) {


        /*
         * declaraçao de variaveis
         */


        int soma;

        /*
         * entrada de dados
         */


        /*
         * processamento
         */

        soma = x + y;
        /*
         * saida de dados
         */

        System.out.println("[metodo  soma] Soma= " + soma);
    }


    public static void subtracao() {

        /*
         * declaraçao de variaveis
         */


        int subtracao;


        /*
         * processamento
         */

        subtracao = x - y;

//          saida de dados


     System.out.println("[metodo subtracao] Subtracao= " + subtracao);
    }


    public static void multiplicacao( ) {

        /*
         * declaraçao de variaveis
         */


        int multiplicacacao;


        /*
         * processamento
         */

         multiplicacacao= x * y;

        /*
         * saida de dados
         */

        System.out.println("[metodo multiplicacao] Multiplicacao= " + multiplicacacao);
    }


    public static void divisao( ) {

        /*
         * declaraçao de variaveis
         */


        int divisao;


        /*
         * processamento
         */

        divisao = x / y;

        /*
         * saida de dados
         */

        System.out.println("[metodo divisao] Divisao= " + divisao);
    }







}

