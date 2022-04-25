package exercicios;

import java.util.Random;

/**
 * Escreva um programa que leia um vetor de 13 elementos inteiros,
 *      que é o Gabarito de um teste da loteria esportiva,
 *      contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3).
 *
 * Leia, a seguir, para cada apostador,
 *      o número do seu cartão e um vetor de Respostas de 13 posições.
 *
 * Verifique para cada apostador o números de acertos,
 *      comparando o vetor de Gabarito com o vetor de Respostas.
 *
 * Escreva o número do apostador e o número de acertos.
 * Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".
 */
public class Exercicio6 {
     public static void main(String[] args) {
         int[] gabarito = new int[13];

         for(int i = 0; i < gabarito.length; i++) {
             int resposta = new Random().nextInt(3)+1;
             gabarito[i] = resposta;
             System.out.printf(" %d ", resposta);
         }
         System.out.println();

         int[] respostas = {1, 3, 2, 3, 1, 2, 2, 3, 1, 1, 2, 3, 1};

         int qtdAcertos = 0;

         for(int i = 0; i < respostas.length; i++) {
             if (respostas[i] == gabarito[i]) {
                 qtdAcertos++;
             }
         }

         System.out.println("Quantidade de Acertos: " + qtdAcertos);

         if (qtdAcertos == 13) {
             System.out.println("Parabéns, você venceu na vida!");
         }

     }
}
