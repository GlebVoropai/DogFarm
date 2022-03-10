package mockingbird;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Set the number of dogs");
        int userNumber = in.nextInt();
        arrayCreation(userNumber);
        arrayDisplay(arrayCreation(userNumber), userNumber);
        System.out.println("Choose a dog");
        int userSelection = in.nextInt();
        if (userSelection > arrayCreation(userNumber).length) {
            System.out.println("Incorrect number of a dog");

        }
        System.out.println("""
                Choose an option:
                 1.Look through the dog's diet
                 2.Feed the dog
                 3.Inspect the dog
                 4.Clean the aviary
                 5.Sent the dog to service
                 6.Start training
                \s""");
        optionMenu(arrayCreation(userNumber), userSelection, in.nextInt());
    }

    public static void optionMenu(Dog[] dogArray, int userSelection, int caseInput) {

        switch (caseInput) {
            case 1: {
                Diet.createDiet(dogArray[userSelection - 1].getAge());
            }
            break;
            case 2: {
                Diet.Feeding(dogArray[userSelection - 1]);
            }
            break;
            case 3: {
                Vet.inspectADog(dogArray[userSelection - 1]);
            }
            break;
            case 4: {
                Janitor.cleanTheAviary();
            }
            break;
            case 5: {
                Trainer.sendToService(dogArray[userSelection - 1].getAge());
            }
            break;
            case 6: {
                Trainer.startTraining(dogArray[userSelection - 1]);
            }
            break;

        }
    }

    public static Dog[] arrayCreation(int n) {
        Dog[] dogArray = new Dog[n];
        for (int i = 0; i < n; i++) {
            String name = "Dog" + (i + 1);
            Dog dog = new Dog(name, new Random().nextBoolean(), new Random().nextBoolean(),
                    new Random().nextBoolean(), (int) (Math.random() * 10) + 1);
            dogArray[i] = dog;
        }
        return dogArray;
    }

    public static void arrayDisplay(Dog[] dogArray, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Reviewing a dog: " + dogArray[i].getName() + "  Age: " + dogArray[i].getAge() + "  Training status: " + dogArray[i].isTrainingStage()
                    + "  Hunger status: " + dogArray[i].isHungerStage() + "  Health status:" + dogArray[i].isHealthStage());
        }

    }
}
