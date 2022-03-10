package mockingbird;

public class Vet {
    public static void inspectADog(Dog dog){
        System.out.println("The dog was inspected");
         if (!dog.isHealthStage())
         {
             System.out.println("Dog has been sent for treatment");

         }
        else {
             System.out.println("The dog is feeling good, no need for treatment");
         }
    }


}
