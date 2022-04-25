package exercicios;

import java.util.Scanner;

/**
 * Uma loja está levantando o valor total de todas as mercadorias em estoque.
 * Escreva um algoritmo que permita a entrada das seguintes informações:
 *
 *  a quantidade de produtos que irá cadastrar para cada produto:
 *      o nome do produto
 *      o número total de mercadorias no estoque;
 *      o valor unitário da mercadoria.
 *
 *  Imprimir o valor total em estoque e a média de valor das mercadorias.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        int numeroMercadoriasEstoque = 0;
        double valorTotalEstoque = 0;
        double valorTotalMercadorias = 0;
        for(int i = 0; i < quantidadeProdutos; i++) {
            scanner.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite o numero de mercarias no estoque");
            int mercadoriasEstoque = scanner.nextInt();

            System.out.printf("Digite o valor unitário do produto %s: \n", nomeProduto);
            double valorUnitario = scanner.nextDouble();

            valorTotalEstoque += valorUnitario * mercadoriasEstoque;
            valorTotalMercadorias += valorUnitario;
            numeroMercadoriasEstoque += mercadoriasEstoque;
        }

        System.out.println("VALOR TOTAL DO ESTOQUE: " + valorTotalEstoque);
        System.out.println("MEDIA DO VALOR DAS MERCADORIAS: " + (valorTotalMercadorias / quantidadeProdutos));

//        String nomeProdutos[] = new String[quantidadeProdutos];
//        Integer numeroEstoque[] = new Integer[quantidadeProdutos];
//        Double valorUnitario[] = new Double[quantidadeProdutos];
//
//        for (int i = 0; i < quantidadeProdutos; i++) {
//            scanner.nextLine();
//            System.out.printf("Digite o nome do produto %d: \n", i);
//            nomeProdutos[i] = scanner.nextLine();
//
//            System.out.printf("Digite a quantidade do produto %d no estoque: \n", i);
//            numeroEstoque[i] = scanner.nextInt();
//
//            System.out.printf("Digite o valor unitário do produto %d: \n", i);
//            valorUnitario[i] = scanner.nextDouble();
//
//
//        }
//
//        double valorTotalEstoque = 0;
//        double valorMercadorias = 0;
//        for(int i = 0; i < quantidadeProdutos; i++) {
//            System.out.println("Quantidade Estoque: " + numeroEstoque[i]);
//            System.out.println("Valor Unitário: " + valorUnitario[i]);
//
//            valorTotalEstoque += valorUnitario[i] * numeroEstoque[i];
//            valorMercadorias += valorUnitario[i];
//        }
//
//        System.out.println("Valor total do estoque: " + valorTotalEstoque);
//        System.out.println("Média das mercadorias: " + (valorMercadorias / quantidadeProdutos));
    }
}
