package aulas;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // COMENTÁRIO DE UMA ÚNICA LINHA

        /*
            COMENTÁRIO COM MAIS DE UMA LINHA
            EXEMPLO: TESTE = TESTE
         */

        /**
         * COMENTÁRIO COM JAVADOC
         * COM MAIS DE UMA LINHA
         */

        int idade = 55;
        Integer idade2 = 55;

        byte idadeByte = idade2.byteValue();
        double idadeDouble = idade2.doubleValue();

        final int QUANTIDADE_TENTATIVAS = 3;
        double calculo = 20 * Math.PI;

        System.out.println();

    }
}
