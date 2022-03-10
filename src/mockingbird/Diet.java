package mockingbird;

public class Diet   {

    public static void createDiet (int age){
        switch (age){
            case 1,2,3: {
                System.out.println("Dog follows a diet for young species");
            }
            break;
            case 4,5,6,7: {
                System.out.println("Dog follows a diet for middle-age species");
            }
            break;
            case 8,9,10,11: {
                System.out.println("Dog follows a diet for old species");
            }
            break;
            default: {
                System.out.println("Error:incorrect age value created");
            }break;
        }
    }
   public static void Feeding (Dog dog){
        if (!dog.isHungerStage()){
            System.out.println("The dog was fed");
        }
        else {
            System.out.println("The dog is not hungry");
        }

    }


}
