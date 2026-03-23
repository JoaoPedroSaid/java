package atividades;

import java.util.Scanner;

public class questoes {
    

    public static void main(String[] args){

        /*  01: 
        for (int a = 0; a<=10; a++){
            System.out.println(a);
        }
        */

        /*  02:
        for (int a = 0; a<=100; a=a+2){
            System.out.println(a);
        }
        */      
        
        /*  03:    
        int numero = 67;
        
        for (int a=0; a<=10; a++){
            System.out.println(numero*a);
        }
        */   

        /*  04: 
        int soma = (1 + 100) * 100 / 2; obs: fórmula da soma da PA
        System.out.println(soma); 
        */

        /*  05: 
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Escreva o segundo número: ");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("O número 1 é maior.");
        } else {
            System.out.println("O número 2 é maior.");
        }

        input.close();


















    }
}