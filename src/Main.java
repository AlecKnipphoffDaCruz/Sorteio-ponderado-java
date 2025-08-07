import java.util.List;
import java.util.ArrayList;
import java.util.Collections; // se for usar Collections.sort()
import java.util.Comparator;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user1 = new User("user1", setor.TI, 10, 4);
        User user2 = new User("user2", setor.TI, 3,1);
        User user3 = new User("user3", setor.TI, 1,3);
        User user4 = new User("user4", setor.RH, 4, 1);
        User user5 = new User("user5", setor.RH, 2, 2);
        User user6 = new User("user6", setor.RH, 2, 1);


        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        Ingresso NovoEvento = new Ingresso("Evento", 4, 2, 2);

        List<User> escolhidos = NovoEvento.usersEscolhidos(users);

        for (User c : escolhidos){
            System.out.println(c.nome + " "+ c.indice);
        }

    }
}