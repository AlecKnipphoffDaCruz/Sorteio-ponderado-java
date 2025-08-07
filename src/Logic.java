public class Logic {

    public int[] quantidadeParaCada(int quantidadeIngressos, int pessoasSetorRh, int pessoasSetorTi) {
        int totalPessoas = pessoasSetorRh + pessoasSetorTi;

        int ingressosTi = (int) Math.round((double) pessoasSetorTi / totalPessoas * quantidadeIngressos);
        int ingressosRh = quantidadeIngressos - ingressosTi;

        return new int[]{ingressosTi, ingressosRh};
    }
}
