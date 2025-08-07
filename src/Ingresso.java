import java.util.*;

public class Ingresso {
    String nome;
    int quantidade_ingresso;
    int quantidade_setor_Ti;
    int quantidade_setor_Rh;

    public Ingresso(String nome,
    int quantidade_ingresso,
    int quantidade_setor_Ti,
    int quantidade_setor_Rh){
        this.nome = nome;
        this.quantidade_ingresso = quantidade_ingresso;
        this.quantidade_setor_Ti = quantidade_setor_Ti;
        this.quantidade_setor_Rh = quantidade_setor_Rh;
    }
    public int getQuantidade_ingresso(){
        return this.quantidade_ingresso;
    }



    public List<User> usersEscolhidos(List<User> users) {
        int quantidade_Ti = this.quantidade_setor_Ti;
        int quantidade_RH = this.quantidade_setor_Rh;

        List<User> arrayTi = new ArrayList<>();
        List<User> arrayRh = new ArrayList<>();
        List<User> escolhidos = new ArrayList<>();

        for (User u : users) {
            if (u.setor == setor.TI) {
                arrayTi.add(u);
            } else if (u.setor == setor.RH) {
                arrayRh.add(u);
            }
        }

        escolhidos.addAll(sortearComPeso(arrayTi, quantidade_Ti));
        escolhidos.addAll(sortearComPeso(arrayRh, quantidade_RH));

        return escolhidos;
    }

    private List<User> sortearComPeso(List<User> candidatos, int quantidade) {
        List<User> sorteados = new ArrayList<>();
        Random random = new Random();

        List<User> copia = new ArrayList<>(candidatos);

        for (int i = 0; i < quantidade && !copia.isEmpty(); i++) {
            float somaPesos = (float) copia.stream().mapToDouble(u -> u.indice).sum();

            float r = random.nextFloat() * somaPesos;
            float acumulado = 0;

            for (User u : copia) {
                acumulado += u.indice;
                if (acumulado >= r) {
                    sorteados.add(u);
                    copia.remove(u);
                    break;
                }
            }
        }

        return sorteados;
    }


}
