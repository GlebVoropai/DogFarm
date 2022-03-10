package mockingbird;

public class Trainer {

    public static void startTraining(Dog dog) {
        if (!dog.isTrainingStage()){
            System.out.println("Training has started.");
        }
        else {
            System.out.println("The dog is already trained.");
        }
    }

    public static void sendToService (int age){
        switch (age){
            case 1,2,3: {
                System.out.println("THe dog is too young to be sent");
            }
            break;
            case 4,5,6,7: {
                System.out.println("The dog was successfully sent to service");
            }
            break;
            case 8,9,10,11: {
                System.out.println("The dog is too old to be sent");
            }
            break;
            default: {
                System.out.println("Error:incorrect age value created");
            }break;
        }
    }
}
