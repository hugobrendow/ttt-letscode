package aulas;

public enum Turno {
    MANHA(1, "manhã"), TARDE(2, "tarde"), NOITE(3, "noite");

    int id;
    String descricao;
    Turno(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
