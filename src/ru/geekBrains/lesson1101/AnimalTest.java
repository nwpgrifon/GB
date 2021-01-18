package ru.geekBrains.lesson1101;

import java.util.Random;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();
        playGame(participants);

    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(200, 450, 600),
                new Dog(200, 450, 600),
                new Dog(),
                new Cat(),
                new Cat(200,45),
        };

    }

    public static void playGame(Animal[] participants) {
        Random random = new Random();

        for (Animal participant : participants) {
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.jump(random.nextInt(5)));
            System.out.println(participant.swim(random.nextInt(100)));
            System.out.println();
        }
    }

}
