/* 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores 
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
ou não a sequência. */

import java.util.Scanner;

public class Questao1 {

    public static boolean Fibonacci(int numeroAtual){
        if (numeroAtual == 0 || numeroAtual == 1){
            return true;
        }
        int primeiroNumero = 0;
        int segundoNumero = 1;
        while ( segundoNumero < numeroAtual){
            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }

        return segundoNumero == numeroAtual;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroAtual = input.nextInt();

        if(Fibonacci(numeroAtual)){
            System.out.println("O número " + numeroAtual + " pertence a sequência de Fibonacci.");
        }else{
            System.out.println("O número " + numeroAtual + " não pertence a sequência de Fibonacci.");
        }

        input.close();
    }
}


