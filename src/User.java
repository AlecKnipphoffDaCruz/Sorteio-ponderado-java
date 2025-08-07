public class User {
    String nome;
     setor setor;
     int eventos_comparecidos;
     int eventos_perdidos;
     float indice;



     public User(String nome, setor setor, int eventos_perdidos, int eventos_comparecidos){
        this.nome = nome;
        this.setor = setor;
        this.eventos_perdidos = eventos_perdidos;
        this.eventos_comparecidos = eventos_comparecidos;
        this.indice = eventos_perdidos/eventos_comparecidos;
     }


}
