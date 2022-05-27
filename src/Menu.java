import java.util.Scanner;

public class Menu{
    Scanner sn = new Scanner(System.in);
    String name, lastName, player;
    void consola() {
            User user = new User();
            Questions q = new Questions();
            System.out.println("------------- Bienvenido al concurso de preguntas de Sofka -------------\n");
            System.out.println("Porfavor digita tu nombre");
            name = user.setName(sn.next());
            lastName = user.setLastName(sn.next());
            player = user.getName() + " " + user.getLastName();
            System.out.println("Muy bien " + player + ", Vamos a jugar!!!");
            q.level1Questions(q.randomQuestions());
    }
}

