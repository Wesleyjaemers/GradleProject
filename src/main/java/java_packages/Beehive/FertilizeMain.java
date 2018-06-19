package java_packages.Beehive;

import java.util.Scanner;

public class FertilizeMain {
    public static void main(String[] args) {

        Scanner inputDrone = new Scanner(System.in);
        Scanner inputQueen = new Scanner (System.in);

        Drone Joske = new Drone("Joske",5,500, 100,"Casual");
        Drone Adonis = new Drone("Adonis",8,300, 100,"Stud");
        Drone Josti = new Drone("Josti",2,900, 100,"Special");

        Drone [] droneList = new Drone[3];
        droneList[0]= Joske;
        droneList[1]= Adonis;
        droneList[2]= Josti;

        Queen Latifa = new Queen ("Latifa",50, 20,"Diva", 100);
        Queen Cruella = new Queen ("Cruella", 30,10,"Furless", -100);
        Queen Shaniqua = new Queen ("Shaniqua",65,35,"Don't be playin with me!", 100);

        Queen [] queenList = new Queen [3];
        queenList [0] = Latifa;
        queenList [1] = Cruella;
        queenList [2] = Shaniqua;

        System.out.println("The brave ones: ");
        for (Drone d : droneList){
            System.out.println(d.name+" ("+d.type+')');
        }
        System.out.println("Choose your drone (1-3)");
        int indexDrone = inputDrone.nextInt()-1;

        System.out.println("The Queens");
        for (Queen q : queenList){
            System.out.println(q.name+" ("+q.type+")");
        }
        System.out.println("Choose Queen to impress (1-2)");
        int indexQueen = inputQueen.nextInt()-1;

        System.out.println("Let the dancing begin!");
        queenList [indexQueen].danceOff(droneList[indexDrone]);

        boolean badEnergy = true;
        while (badEnergy) try {
            if (queenList[indexQueen].getEnergy() < 0) {
                throw new QueenIsTired("Queen is tired");

            }  // custom exception
            queenList[indexQueen].layLarva();
            //}catch (QueenIsTired q){
            // System.out.println("Queen is tired");
            // badEnergy = false;
        }catch (QueenIsTired e){
            badEnergy = false;
            System.out.println(e.getMessage());
        }

    }
}
