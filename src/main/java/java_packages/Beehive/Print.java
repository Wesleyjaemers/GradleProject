package java_packages.Beehive;

import java.util.Scanner;

public class Print {


    public static void introPrint() {

        Scanner inputDrone = new Scanner(System.in);
        Scanner inputQueen = new Scanner (System.in);

        Drone joske = new Drone("Joske", 5, 500, 100, "Casual");
        Drone adonis = new Drone("Adonis", 8, 300, 100, "Stud");
        Drone josti = new Drone("Josti", 2, 900, 100, "Special");

        Drone[] droneList = new Drone[3];
        droneList[0] = joske;
        droneList[1] = adonis;
        droneList[2] = josti;

        Queen latifa = new Queen("Latifa", 50, 20, "Diva",100);
        Queen cruella = new Queen("Cruella", 30, 10, "Furless",100);
        Queen shaniqua = new Queen("Shaniqua", 65, 40, "Don't be playin with me!",100);

        Queen[] queenList = new Queen[3];
        queenList[0] = latifa;
        queenList[1] = cruella;
        queenList[2] = shaniqua;


        System.out.println("The brave ones: ");
        System.out.println("<------------->");
        for (Drone d : droneList) {
            System.out.println(d.getName() + " (" + d.type + ')');
        }
        System.out.println("Choose your drone (1-3)");
        int indexDrone = inputDrone.nextInt() - 1;

        System.out.println("The Queens");
        System.out.println("<--------->");
        for (Queen q : queenList) {
            System.out.println(q.getName() + " (" + q.type + ")");
        }
        System.out.println("Choose Queen to impress (1-3)");
        int indexQueen = inputQueen.nextInt() - 1;

        System.out.println("Let the dancing begin!");
        System.out.println("<-------------------->");
        queenList[indexQueen].danceOff(droneList[indexDrone]);
    }
}
