import java.util.ArrayList;

public class BusStop {

    String stop;
    ArrayList<Person> queue;

    public BusStop(String inputStop) {
        this.stop = inputStop;
        this.queue = new ArrayList<>();
    }


    public void addPerson(Person person){
        this.queue.add(person);
    }

    public int getQueueSize() {
        return this.queue.size();
    }

    public Person removePerson() {
        return this.queue.remove(0);
    }
}
