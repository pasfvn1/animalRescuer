package org.fasttrakit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Animal rescuer" );

        Veterinarian veterinarianReference = new Veterinarian();
        veterinarianReference.name = "George";
        veterinarianReference.specialization = "Surgeon";

        System.out.println("Propertis of" + veterinarianReference.name);
        System.out.println("specialization" + veterinarianReference. specialization);

        Animal animalReference = new Animal();
        animalReference.age = 1;
        animalReference.name = "Ugly";
        animalReference.feelingHungry = 6;
        animalReference.foodName = "meat";
        animalReference.healthCondition = 4;
        animalReference.mood = 5;
        animalReference.moodName = "dizzy";
        animalReference.recreational = "rest";

        System.out.println("Propertis of" + animalReference. age);
        System.out.println( "name" + animalReference.name);
        System.out.println("feelingHungry" + animalReference.feelingHungry);
        System.out.println("foodName" + animalReference.foodName);
        System.out.println("healtCondition" + animalReference.healthCondition);
        System.out.println("mood" + animalReference.mood);
        System.out.println("moodName" + animalReference.moodName);
        System.out.println("recreational" + animalReference.recreational);


        Recreational recreationalReference = new Recreational();
        recreationalReference.raName = "sleep";

        System.out.println("Propertis of" + recreationalReference.raName);


        AnimalFood animalFoodReference = new AnimalFood();
        animalFoodReference.name = "DogFood";
        animalFoodReference.amount = 0.5;
        animalFoodReference.available = "yes";
        animalFoodReference.price = 2.5;

        System.out.println("Propertis of" + animalFoodReference.name);
        System.out.println("amout" + animalFoodReference.amount);
        System.out.println("available" + animalFoodReference.available);
        System.out.println(" price" + animalFoodReference.price);

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.name = "Ayan";
        rescuerReference.amoutMoney = 50.3;

        System.out.println("Propertis of" + rescuerReference.name);
        System.out.println(" amoutMoney" + rescuerReference.amoutMoney);

        Game gameReference = new Game();
        gameReference.dog = "Ugly";
        gameReference.rescuer = "Ayan";
        gameReference.veterinarian = "George";

        System.out.println("Propertis of" + gameReference.dog );
        System.out.println("rescuer" + gameReference.rescuer);
        System.out.println("veterinairian" + gameReference.veterinarian);










    }
}
