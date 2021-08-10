package queue;

public class App {
    public static void main(String[] args) throws Exception {
        Cats cat1=new Cats("shemsh");
        Cats cat2=new Cats("kitkit");


        Dogs dog1=new Dogs("Rocky");
        Dogs dog2=new Dogs("MILO");



        AnimalShelter animalShelter=new AnimalShelter();
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);

        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("rubberDuck"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("Fox"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("dog"));
        System.out.println("*******************************************");
        System.out.println(animalShelter.dequeue("horse"));

    }
}