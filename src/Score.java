import java.util.Scanner;

public class Score {

    private Scanner teclado = new Scanner(System.in);
    int [] Vector = new int [2];

    public void Answer()
    {
        Vector[1] = Vector[1]+100;
        System.out.print("Respuesta correcta! Ganas $100, tu premio actual es: "+"$"+Vector[1]+" Dolares\n");
    }

    public void Prize(){
        System.out.print("$"+Vector[1]*2+" Dolares!!!");
    }

    public void Acumulated(){
        System.out.println("$"+Vector[1]+" Dolares");
    }


}
