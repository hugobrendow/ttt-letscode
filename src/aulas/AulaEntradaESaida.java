package aulas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class AulaEntradaESaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("IMPRIMINDO COM PRINTLN");
        System.out.print("IMPRIMINDO NA MESMA LINHA\n");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o nome do seu pai: ");
        String pai = scanner.nextLine();
        scanner.close();

        Date data = new Date();
//        System.out.printf("%s %tB %<td", "Today",  d);

        System.out.printf("O %s tem %d anos e recebe %.2f, contratado: %tT", nome, idade, salario, data);
//        System.out.println("O " + nome + " tem " + idade + " anos");

        LocalDateTime dataInicial = LocalDateTime.of(1997, 01, 28, 12, 0);
        LocalDateTime dataFinal = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(dataInicial, dataFinal);
        System.out.printf("\nQuantos dias se passaram: %d", days);

    }
}
