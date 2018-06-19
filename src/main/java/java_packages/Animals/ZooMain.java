package java_packages.Animals;

import java_packages.Theorie.Random;

import java.util.Scanner;

public class ZooMain {


    public static void main(String[] args) {

        Scanner inputAnimal = new Scanner(System.in);

        Mammal[] mammalList = {new Cat("Jos"),
                new Cat("Kat"),
                new Dog("Whitey", "Black"),
                new Lion("Simba", 70),
                new Rabbit("Flappie", false),
                new Cat("Ludo"),
                new Lion("Ebert", 40),
                new Rabbit("Joker", false),
                new Dog("Blackie", "white"),
                new Lion("Wannabe", 10)
        };

        Mammal[] mammalList2 = new Mammal[10];

        for (int i = 0; i < mammalList.length; i++) {
            mammalList[Random.berekenRandomGetal(0, 9)].sound();  // methode uit een ander package
        }


        for (int j = 0; j < mammalList2.length; j++) {
            System.out.println("Choose which animal to create: Cat (1), Dog (2), Lion (3), Rabbit (4), Goat (5)");
            switch (inputAnimal.nextInt()) {
                case 1:
                    System.out.println("Give your cat a name");
                    mammalList2[j] = new Cat(inputAnimal.next());
                    break;

                case 2:
                    System.out.println("Give your dog a name");
                    mammalList2[j] = new Dog(inputAnimal.next(), "Black");
                    break;

                case 3:
                    System.out.println("Give your lion a name");
                    mammalList2[j] = new Lion(inputAnimal.next(), 60);
                    break;

                case 4:
                    System.out.println("Give your rabbit a name");
                    mammalList2[j] = new Rabbit(inputAnimal.next(), false);
                    break;

                case 5:
                    System.out.println("Give your goat a name");
                    mammalList2[j] = new Goat(inputAnimal.next(), true, "Zwart/wit gevlekt");
                    break;
            }

        }
        System.out.println("What incredible sounds");
        for (int k = 0; k < mammalList2.length; k++) {
            mammalList2[k].sound();
            mammalList2[k].eat();
            if(mammalList2[k] instanceof Dog){
                ((Dog)(mammalList2[k])).doTrick();
            }

        }
    }
}