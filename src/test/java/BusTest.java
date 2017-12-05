import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus myBus;
    Person person1;
    Person person2;
    Person person3;
    BusStop myBusStop;

    @Before
    public void before(){
        myBus = new Bus("Glasgow", 2);
        person1 = new Person("Andrew");
        person2 = new Person("James");
        person3 = new Person("Simon");
        myBusStop = new BusStop("Queen Street");
        myBusStop.addPerson(person1);
        myBusStop.addPerson(person2);
    }

    @Test
    public void busStartEmpty(){
        assertEquals(0, myBus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        myBus.addPerson(person1);
        assertEquals(1, myBus.getPassengerCount());
    }

    @Test
    public void cantAddWhenCapacity(){
        myBus.addPerson(person1);
        myBus.addPerson(person2);
        myBus.addPerson(person3);
        assertEquals(2, myBus.getPassengerCount());
    }

    @Test
    public void canRemovePerson(){
        myBus.addPerson(person1);
        myBus.addPerson(person2);
        myBus.removePerson(person1);
        assertEquals(1, myBus.getPassengerCount());
    }

    @Test
    public void canPickUp(){
        myBus.pickUp(myBusStop);
        assertEquals(1, myBus.getPassengerCount());
        assertEquals(1, myBusStop.getQueueSize());
    }

    @Test
    public void canPickUpTwice(){
        myBus.pickUp(myBusStop);
        myBus.pickUp(myBusStop);
        assertEquals(2, myBus.getPassengerCount());
        assertEquals(0, myBusStop.getQueueSize());
    }
}
