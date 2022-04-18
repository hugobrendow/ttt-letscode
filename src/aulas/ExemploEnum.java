package aulas;

public class ExemploEnum {
    public static void main(String[] args) {
        Turno manha = Turno.NOITE;
        System.out.println("id: " + manha);
        System.out.println("descrição: " + manha.descricao);

        int contador = 2;
        System.out.println("Contador: " + contador*2);
        System.out.println("Contador outra vez: " + --contador);
        System.out.println("Contador mais outra vez: " + contador);

        double x = 100.00/94.00;
        System.out.println(x);
    }
}
