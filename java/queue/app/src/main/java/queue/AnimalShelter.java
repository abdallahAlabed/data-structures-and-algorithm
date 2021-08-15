package queue;

public class AnimalShelter<T> {
    Queue<T> dogs;
    Queue<T> cats;

    public AnimalShelter() {
        dogs = (Queue<T>) new Queue<Dogs>();
        cats = (Queue<T>) new Queue<Cats>();
    }

    public void enqueue(T animal) throws Exception {
        try {
            if (animal instanceof Cats) {
                cats.enqueue(animal);

            } else if(animal instanceof Dogs){
                dogs.enqueue(animal);
            }else {
                System.out.println("Sorry we don't have this type of animal in the Shelter ");
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public T dequeue(T animal) throws Exception {
        try {
            if (animal.equals("dog")) {
                return dogs.dequeue();
            } else if (animal.equals("cat")) {
                return cats.dequeue();
            } else {
                return (T) ("Sorry We cant have a "+animal+" in the Shelter ");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (animal == "cat"){
            return (T) "Sorry the cat Shelter is Empty ";

        }else if (animal == "dog"){
            return (T) "Sorry the dog Shelter is Empty ";
        }else {
            return (T) "Sorry we  dont have this type of animal in the Shelter ";
        }

    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs.front.value +
                ", cats=" + cats.front.value +
                '}';
    }
}