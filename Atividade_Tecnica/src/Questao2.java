/*Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, 
além de informar a quantidade de vezes em que ela ocorre. */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a String: ");
        String entrada = input.nextLine();
        entrada = entrada.toLowerCase();

        if( entrada.contains("a")){
            int contador = 0; 
            for(int i=0; i<entrada.length(); i++ ){
                if(entrada.charAt(i) == 'a'){
                    contador++;
                }
            }
            System.out.println("A String possui " + contador + " letras 'a'");

        }else{
            System.out.println("A String não possui letras 'a'");
        }

        input.close();
    }
}
