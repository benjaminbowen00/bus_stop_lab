import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop myBusStop;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before(){
        myBusStop = new BusStop("Queen Street");
        person1 = new Person("Andrew");
        person2 = new Person("James");
        person3 = new Person("Simon");
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, myBusStop.getQueueSize());
    }

    @Test
    public void canAddToQueue(){
        myBusStop.addPerson(person1);
        assertEquals(1, myBusStop.getQueueSize());
    }

    @Test
    public void canRemoveFromQueue(){
        myBusStop.addPerson(person1);
        myBusStop.addPerson(person2);
        myBusStop.removePerson();
        assertEquals(1, myBusStop.getQueueSize());
    }


}
