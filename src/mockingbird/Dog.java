package mockingbird;

public class Dog {
    private String name;
    private boolean healthStage;
    private boolean hungerStage;
    private boolean trainingStage;
    private int age;

    public Dog() {
    }

    public Dog(String name, boolean healthStage, boolean hungerStage, boolean trainingStage, int age) {
        this.name = name;
        this.healthStage = healthStage;
        this.hungerStage = hungerStage;
        this.trainingStage = trainingStage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthStage() {
        return healthStage;
    }

    public void setHealthStage(boolean healthStage) {
        this.healthStage = healthStage;
    }

    public boolean isHungerStage() {
        return hungerStage;
    }

    public void setHungerStage(boolean hungerStage) {
        this.hungerStage = hungerStage;
    }

    public boolean isTrainingStage() {
        return trainingStage;
    }

    public void setTrainingStage(boolean trainingStage) {
        this.trainingStage = trainingStage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
