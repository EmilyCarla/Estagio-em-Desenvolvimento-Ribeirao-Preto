/*3) Observe o trecho de código abaixo: 
int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? */
// Ao final do processamento o valor de SOMA será 77, porque assim que a variável K assume o valor de 12 o laço é interrompido, mas como a verificação só é realizada no
// início do laço, a variável SOMA ainda será implementada com o valor de k=12.

public class Questao3 {
    public static void main(String[] args) {
        
        int INDICE = 12, SOMA = 0, K = 1; 
        
        while (K < INDICE){
            K = K + 1; SOMA = SOMA + K; 
       }
        System.out.println(SOMA);
    }
}
