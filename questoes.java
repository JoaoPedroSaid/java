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
        */

        /*  07: 
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("O que você quer fazer? \n");
        System.out.println("1 - Cadastrar\n2 - Listar\n3 - Sair\n");

        opcao = input.nextInt();
        
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro.");
                    break;
                case 2:
                    System.out.println("Lista");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Número inválido, digite novamente...\n");
                    break;
            }
        }while (opcao !=3);
        
        input.close();
        */

        /*  08: 
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }
        */

        /*  09: 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva sua nota 1 ");
        int nota1 = input.nextInt();

        System.out.println("Escreva sua nota 2 ");
        int nota2 = input.nextInt();

        float media = (nota1+nota2)/2.0f;
        String status;

        if (media>=70){
            status = "aprovado";
        }
        else if (media>=50){
            status = "de recuperação";
        }
        else{
            status = "reprovado";
        }

        System.out.println("Sua média é: "+ media +" e você está "+ status);

        input.close();
        */
    }
}
