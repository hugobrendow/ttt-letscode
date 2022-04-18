package aulas;

public class AUlaMatriz {
    public static void main(String[] args) {

        int temperaturasPorEstacao[][] = {{38, 28, 27, 30}, {35, 22, 21, 19}, {41, 18, 21, 34}};
        String estados[] = {"Brasília", "São Paulo", "Minas"};
        String estacoes[] = {"Verão", "Inverno", "Primavera", "Outono"};

        for(int i = 0; i < temperaturasPorEstacao.length; i++) {
            System.out.printf("ESTADO: %s\n", estados[i]);
            for(int j = 0; j < temperaturasPorEstacao[i].length; j++) {
                System.out.printf("Estação %s: %d \n", estacoes[j], temperaturasPorEstacao[i][j]);
            }
            System.out.println("\n");
        }

        String paises[][] = new String[2][3];

        paises[0][0] = "Brasil";
        paises[0][1] = "Argentina";
        paises[0][2] = "Chile";

        paises[1][0] = "França";
        paises[1][1] = "Alemanha";
        paises[1][2] = "Portugal";

        for (int i = 0; i < paises.length; i++) {
//            for (int j = 0; j < paises[i].length; j++) {
//                System.out.printf("%s ", paises[i][j]);
//            }
            for (String pais : paises[i]) {
                System.out.printf("%s ", pais);
            }
            System.out.println();
        }


    }
}
