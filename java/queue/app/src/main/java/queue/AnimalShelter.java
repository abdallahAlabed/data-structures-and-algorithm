package queue;

public class AnimalShelter<T> {
    Queue<T> dogs;
    Queue<T> cats;

    public AnimalShelter() {
        dogs = new Queue<>();
        cats = new Queue<>();
    }

    public void enqueue(T animal) throws Exception {
        try {
            if (animal instanceof Cats) {
                cats.enqueue(animal);

            } else {
                dogs.enqueue(animal);
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


}