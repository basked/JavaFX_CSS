package bas.telphone.JavaFX.interfaces.impls;

/**
 * Created by basked on 03.05.2017.
 */

import bas.telphone.JavaFX.interfaces.AddressBook;
import bas.telphone.JavaFX.objects.Person;

import java.util.ArrayList;

public class CollectionAddressBook implements AddressBook {

    private ArrayList<Person> personList = new ArrayList<Person>();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void edit(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void print() {
        int number = 0;
        System.out.println();
        for (Person person : personList) {
            number++;
            System.out.println(number + ") FIO=" + person.getFio() + "; Phone=" + person.getPhone());
        }
    }

    public void fillTestData() {
        personList.add(new Person("Мисюля Д.Н.", "+375 29 821-03-44"));
        personList.add(new Person("Мисюля И.В.", "+375 29 588-79-29"));
        personList.add(new Person("basket3", "3333"));
        personList.add(new Person("basket4", "4444"));
        personList.add(new Person("basket5", "5555"));
    }
}
