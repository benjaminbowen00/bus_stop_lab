import java.util.ArrayList;

public class Bus {

    String destination;
    int capacity;
    ArrayList<Person> passengers;

    public Bus(String inputDestination, int inputCapacity) {
        this.destination = inputDestination;
        this.capacity = inputCapacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePerson(Person person){
        this.passengers.remove(person);
    }

    public void pickUp(BusStop inputBusStop){
        addPerson(inputBusStop.removePerson());
    }

}
