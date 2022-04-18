package aulas;

public class AulaArray {
    public static void main(String[] args) {
        int idades[] = new int[10];
        idades[0] = 10; // PRIMEIRA POSIÇÃO -> 10
        idades[1] = 24; // SEGUNDA POSIÇÃO -> 24
        idades[2] = 25;
        idades[9] = 29;
        System.out.println("Última idade: " + idades[9]);

        int numeroAlunos[] = {20, 44, 69, 80, 100, 100, 230, 100, 210, 10, 213, 1231, 123};
        System.out.println("Número de salas: " + numeroAlunos.length); // TAMANHO DO ARRAY
        System.out.println("Buscar última posição do Array: " + numeroAlunos[numeroAlunos.length - 1]);

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}
