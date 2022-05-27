import java.util.Scanner;
import java.util.Random;
public class Questions {
    Score p = new Score();
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
    public int randomQuestions(){
        int randomQuestion = 1 + this.random.nextInt(5);
        return randomQuestion;
    }
    void level1Questions(int randomQuestion){
        System.out.println("\n------------ Bienvenido al nivel 1 - Cultura Pop ------------\n");
        System.out.println("Pregunta aleatoria #: " + randomQuestion +"\n");
        System.out.println("Asegurate de responder con la letra que creas correspondiente a la respuesta\n");
        if(randomQuestion == 1) {
            System.out.println("¿Qué nombre recibe el punto de máxima tensión de una narración?\n ");
            System.out.println("a)Nudo\nb)Desenlace\nc)Segundo Acto\nd)Climax");
            if (keyboard.nextLine().equals("d")){
                p.Answer();
                level2Questions(randomQuestions());
            }else{
                System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                System.exit(0);
            }
        }else if (randomQuestion == 2) {
            System.out.println("¿Qué nombre tiene el sistema de numeración en el que solo se usan ceros y unos?\n");
            System.out.println("a)Binario\nb)Cuaternario\nc)Decimal\nd)Sexagesimal\n");

            if (keyboard.nextLine().equals("a")){
                p.Answer();
                level2Questions(randomQuestions());
            }else{
                System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                System.exit(0);
            }
        } else if (randomQuestion == 3) {
            System.out.println("¿Qué nombre tiene la disminución de hemoglobina en la sangre?\n");
            System.out.println("a)Chagas\nb)Hipotiroidismo\nc)Escorbuto\nd)Anemia\n");
            if (keyboard.nextLine().equals("d")){
                p.Answer();
                level2Questions(randomQuestions());
            }else{
                System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                System.exit(0);
            }
        } else if (randomQuestion == 4) {
            System.out.println("¿En que deporte se premia al jugador con menor puntuación?\n");
            System.out.println("a)Voley\nb)Bowling\nc)Golf\nd)Natacion\n");
            if (keyboard.nextLine().equals("c")){
                p.Answer();
                level2Questions(randomQuestions());
            }else{
                System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                System.exit(0);
            }
        } else if (randomQuestion == 5) {
            System.out.println("¿Cuántas ubres tienen las vacas?\n ");
            System.out.println("a)1\nb)2\nc)3\nd)4\n");
            if (keyboard.nextLine().equals("a")){
                p.Answer();
                level2Questions(randomQuestions());
            }else{
                System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                System.exit(0);
            }
        }
    }
    void level2Questions(int randomQuestion){
        System.out.println("\n------------ Bienvenido al nivel 2 - Deportes ------------\n");
        System.out.println("Deseas continuar participando o dejar el concurso? Actualmente tienes un acumulado de: ");
        p.Acumulated();
        System.out.println("a) Si\nb) No");
        if(keyboard.nextLine().equals("a")){
            System.out.println("Pregunta aleatoria #: " + randomQuestion +"\n");
            System.out.println("Asegurate de responder con la letra que creas correspondiente a la respuesta\n");
            if(randomQuestion == 1) {
                System.out.println("¿Cuánto dura un partido de básquet NBA?\n");
                System.out.println("a)35 minutos\nb)40 minutos\nc)48 minutos\nd)60 minutos");
                if (keyboard.nextLine().equals("c")){
                    p.Answer();
                    level3Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }else if (randomQuestion == 2) {
                System.out.println("¿Cuentos cuadrados tiene un tablero de ajedrez?\n");
                System.out.println("a)64\nb)54\nc)81\nd)45\n");
                if (keyboard.nextLine().equals("a")){
                    p.Answer();
                    level3Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 3) {
                System.out.println("¿Cuál fue el año de los Primeros juegos olímpicos?\n");
                System.out.println("a)1900\nb)1896\nc)1832\nd)1928\n");
                if (keyboard.nextLine().equals("b")){
                    p.Answer();
                    level3Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 4) {
                System.out.println("¿Cuántos jugadores hay en el campo de béisbol por equipo?\n");
                System.out.println("a)8\nb)9\nc)10\nd)11\n");
                if (keyboard.nextLine().equals("b")){
                    p.Answer();
                    level3Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 5) {
                System.out.println("¿Cuál es el deporte más practicado en China?\n");
                System.out.println("a)Futbol\nb)Baloncesto\nc)Natacion\nd)Tenis de mesa\n");
                if (keyboard.nextLine().equals("d")){
                    p.Answer();
                    level3Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Esta bien, no te preocupes, te vas a casa con un premio de ");
            p.Acumulated();
            System.exit(0);
        }
    }
    void level3Questions(int randomQuestion){
        System.out.println("\n------------ Bienvenido al nivel 3 - Ciencia ------------\n");
        System.out.println("Deseas continuar participando o dejar el concurso? Actualmente tienes un acumulado de: ");
        p.Acumulated();
        System.out.println("a) Si\nb) No");
        if(keyboard.nextLine().equals("a")){
            System.out.println("Pregunta aleatoria #: " + randomQuestion +"\n");
            System.out.println("Asegurate de responder con la letra que creas correspondiente a la respuesta\n");
            if(randomQuestion == 1) {
                System.out.println("¿Cuál de estos elementos químicos fue descubierto por Marie Curie?\n");
                System.out.println("a)Potasio\nb)Magnesio\nc)Radio\nd)Calcio");
                if (keyboard.nextLine().equals("c")){
                    p.Answer();
                    level4Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }else if (randomQuestion == 2) {
                System.out.println("¿Cuál es el gas más abundante en la atmosfera terrestre?\n");
                System.out.println("a)Oxigeno\nb)Nitrogeno\nc)Dioxido de carbono\nd)Argon\n");
                if (keyboard.nextLine().equals("b")){
                    p.Answer();
                    level4Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 3) {
                System.out.println("¿Cuál es el material más abundante en el núcleo de la tierra?\n");
                System.out.println("a)Hierro\nb)Titanio\nc)Aluminio\nd)Azufre\n");
                if (keyboard.nextLine().equals("a")){
                    p.Answer();
                    level4Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 4) {
                System.out.println("¿Cuántos estados naturales tiene la materia?\n");
                System.out.println("a)2\nb)5\nc)3\nd)4\n");
                if (keyboard.nextLine().equals("d")){
                    p.Answer();
                    level4Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 5) {
                System.out.println("¿Quién fue la primera persona en afirmar que la tierra era redonda?\n");
                System.out.println("a)Pitagoras\nb)Leonardo da Vinci\nc)Albert Einstein\nd)Aristoteles\n");
                if (keyboard.nextLine().equals("a")){
                    p.Answer();
                    level4Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Esta bien, no te preocupes, te vas a casa con un premio de ");
            p.Acumulated();
            System.exit(0);
        }
    }
    void level4Questions(int randomQuestion){
        System.out.println("\n------------ Bienvenido al nivel 4 - Historia ------------\n");
        System.out.println("Deseas continuar participando o dejar el concurso? Actualmente tienes un acumulado de: ");
        p.Acumulated();
        System.out.println("a) Si\nb) No");
        if(keyboard.nextLine().equals("a")){
            System.out.println("Pregunta aleatoria #: " + randomQuestion +"\n");
            System.out.println("Asegurate de responder con la letra que creas correspondiente a la respuesta\n");
            if(randomQuestion == 1) {
                System.out.println("¿Cuál ha sido el imperio más extenso (por superficie) de la historia?\n");
                System.out.println("a)Imperio Ruso\nb)Imperio Español\nc)Imperio Britanico\nd)Imperio Mongol");
                if (keyboard.nextLine().equals("c")){
                    p.Answer();
                    level5Questions(randomQuestion);
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }else if (randomQuestion == 2) {
                System.out.println("El Impresionismo es un movimiento:\n");
                System.out.println("a)Politico\nb)Cientifico\nc)Deportivo\nd)Artistico\n");
                if (keyboard.nextLine().equals("d")){
                    p.Answer();
                    level5Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 3) {
                System.out.println("¿Durante cuales siglos se desarrolló el Romanticismo?\n");
                System.out.println("a.XVIII y XIX\nb.XV y XVI\nc.XII y XIII\nd.XI y XII\n\n");
                if (keyboard.nextLine().equals("a")){
                    p.Answer();
                    level5Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 4) {
                System.out.println("¿Cuánto duro la guerra de los Cien Años?\n");
                System.out.println("a.100 años\nb.101 años\nc.96 años\nd.116 años\n\n");
                if (keyboard.nextLine().equals("d")){
                    p.Answer();
                    level5Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 5) {
                System.out.println("El “Tratado de Versalles” fue firmado luego de:\n");
                System.out.println("a.La Guerra de Vietnam\nb.La Segunda Guerra Mundial\nc.La Primera Guerra Mundial\nd.La Guerra Fría \n\n");
                if (keyboard.nextLine().equals("c")){
                    p.Answer();
                    level5Questions(randomQuestions());
                }else{
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Esta bien, no te preocupes, te vas a casa con un premio de ");
            p.Acumulated();
            System.exit(0);
        }
    }
    void level5Questions(int randomQuestion){
        System.out.println("\n------------ Bienvenido al nivel 5 de Geografia ------------\n");
        System.out.println("Deseas continuar participando o dejar el concurso? Actualmente tienes un acumulado de: ");
        p.Acumulated();
        System.out.println("a) Si\nb) No");
        if (keyboard.nextLine().equals("a")) {
            System.out.println("Asegurate de responder con la letra que creas correspondiente a la respuesta\n");
            System.out.println("Pregunta aleatoria #: " + randomQuestion +"\n");
            if (randomQuestion == 1) {
                System.out.println("¿En qué país se encuentra el “Volcán Masaya”?\n");
                System.out.println("a)Panama\nb)Guatemala\nc)Nicaragua\nd)Honduras");
                if (keyboard.nextLine().equals("c")) {
                    p.Answer();
                    System.out.println("FELICIDADES POR GANAR EL JUEGO!!! Tu premio final es de ");
                    p.Prize();
                    System.exit(0);
                } else {
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 2) {
                System.out.println("¿Cuantas islas conforman Barbados?\n");
                System.out.println("a)Una\nb)Dos\nc)Tres\nd)Cuatro\n");
                if (keyboard.nextLine().equals("a")) {
                    p.Answer();
                    System.out.println("FELICIDADES POR GANAR EL JUEGO!!! Tu premio final es de ");
                    p.Prize();
                    System.exit(0);
                } else {
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 3) {
                System.out.println(" “Bagdad” es la capital de:\n");
                System.out.println("a)Iran\nb)Irak\nc)Siria\nd)Egipto\n");
                if (keyboard.nextLine().equals("b")) {
                    p.Answer();
                    System.out.println("FELICIDADES POR GANAR EL JUEGO!!! Tu premio final es de ");
                    p.Prize();
                    System.exit(0);
                } else {
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 4) {
                System.out.println("¿En qué estado norteamericano se ubica “La Cueva Lechuguilla”?\n");
                System.out.println("a)Arizona\nb)Texas\nc)Nuevo Mexico\nd)Minnesota\n");
                if (keyboard.nextLine().equals("c")) {
                    p.Answer();
                    System.out.println("FELICIDADES POR GANAR EL JUEGO!!! Tu premio final es de ");
                    p.Prize();
                    System.exit(0);
                } else {
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            } else if (randomQuestion == 5) {
                System.out.println("¿Cuantos países nórdicos hay?\n");
                System.out.println("a)Tres \nb)Cuatro\nc)Cinco\nd)Seis\n");
                if (keyboard.nextLine().equals("c")) {
                    Menu m = new Menu();
                    p.Answer();
                    System.out.println("FELICIDADES POR GANAR EL JUEGO!!! Tu premio final es de ");
                    p.Prize();
                    System.exit(0);
                } else {
                    System.out.println("Respuesta incorrecta :( , pierdes tu acumulado, juego terminado. Vuelve a jugar cuando desees!!! ;) ");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Esta bien, no te preocupes, te vas a casa con un premio de ");
            p.Acumulated();
            System.exit(0);
        }
    }
}






